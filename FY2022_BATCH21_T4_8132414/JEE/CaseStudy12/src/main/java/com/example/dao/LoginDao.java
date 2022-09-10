package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class LoginDao {
	Connection con;
	public Connection getConnection() {
		
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/virtusa", "root","Surya@9533");
			
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
			return con;
	}
	
	public void closeConnection() {
		try {
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
