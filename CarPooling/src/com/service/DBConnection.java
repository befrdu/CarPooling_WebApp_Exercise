package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carpoolingdb?useSSL=false","root","root");
			return con;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
}
