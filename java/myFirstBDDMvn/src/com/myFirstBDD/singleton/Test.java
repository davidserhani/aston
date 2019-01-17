package com.myFirstBDD.singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {

		Connection conn = null;
		Statement state = null;
		ResultSet rs = null;
		try {
			conn = GlobalConnection.getInstance();

			state = conn.createStatement();
			rs = state.executeQuery("SELECT * FROM employe");

			System.out.println("\n  -------------    -------------     -----------");
			while (rs.next()) {
				System.out.print("\t" + rs.getInt("id") + "\t |");
				System.out.print("\t" + rs.getString("nom") + "\t |");
				System.out.print("\t" + rs.getString("prenom") + "\t |");
				System.out.println("\n  -------------    -------------     -----------");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				state.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}
