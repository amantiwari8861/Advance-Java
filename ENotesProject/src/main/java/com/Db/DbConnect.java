package com.Db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
	private static Connection con;

	public static Connection getConn() {
		try {

			if (con == null) 
			{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/enotes","root","1234");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return con;
	}
}
