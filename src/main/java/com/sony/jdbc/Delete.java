package com.sony.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		delete();
	}
	public static void delete() {
		//1.load driver class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.get connection
			String url="jdbc:mysql://localhost:3306/sony";
			String userName="root";
			String pass="root";
			Connection connection= DriverManager.getConnection(url, userName, pass);
			
			//create statement
			Statement statement = connection .createStatement();
			
			//excute Query
			statement.execute("DELETE FROM details WHERE id =1");
			
			//close connection
			connection.close();
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		
		}
	}


	}

