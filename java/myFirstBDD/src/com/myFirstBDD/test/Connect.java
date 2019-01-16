package com.myFirstBDD.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connect {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver OK !");
		
			String url = "jdbc:mysql://localhost:8889/global";
			String user = "root";
			String password = "root";
			
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connexion success !");
			
			Statement state = conn.createStatement();
			
			ResultSet rs = state.executeQuery("SELECT * FROM employe");
			System.out.println("\n  -------------    -------------     -----------");
			while (rs.next()) {
				System.out.print("\t" + rs.getInt("id") + "\t |");
				System.out.print("\t" + rs.getString("nom") + "\t |");
				System.out.print("\t" + rs.getString("prenom") + "\t |");
				System.out.println("\n  -------------    -------------     -----------");
			}
			rs.close();
			state.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
