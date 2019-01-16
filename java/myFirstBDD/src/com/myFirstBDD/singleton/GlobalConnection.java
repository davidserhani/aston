package com.myFirstBDD.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GlobalConnection {
	
	private String url = "jdbc:mysql://localhost:8889/global";
	private String user = "root";
	private String password = "root";
	
	private static Connection connect;
	private GlobalConnection() {
		try {
			connect = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getInstance() {
		if (connect == null)
			new GlobalConnection();
		return connect;
	}
}
