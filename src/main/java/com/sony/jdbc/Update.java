package com.sony.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	
	public static void main(String[] args) {
		update();
	}
	
	public static void update() {
		try {
			//1.load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.get connection
			String url="jdbc:mysql://localhost:3306/sony";
			String userName="root";
			String pass="root";
			Connection connection= DriverManager.getConnection(url, userName, pass);
			
			
			Statement statement = connection .createStatement();
			
			
			statement.execute("UPDATE details SET name= 'Anu',WHERE id =2");
			
			connection.close();
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		
		}
	}



		}
	


