package com.pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	public static Connection getConnection() throws ClassNotFoundException
	{
		String url="jdbc:mysql://localhost:3306/";
		String database="jdbc";
		String user="root";
		String password="1234";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=null;
		try {
			con = DriverManager.getConnection(url+database,user,password);
			System.out.println("Connection Created!");
		} catch (SQLException e) {
			System.out.println("connection not created");
		}
		return con;
	}
	
}
