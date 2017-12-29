package com.htc.corejava.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	private static Connection con;
	
	public static Connection getConnection() throws SQLException {
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","bajululhak","PgWelcome1");
		return con;
	}
}

