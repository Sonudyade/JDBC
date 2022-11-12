package com.sony.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Test {
	public static void main(String[] args) {
		add();
	}
	public static void add() {
		
		try {
			//1.load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.get connection
			String url="jdbc:mysql://localhost:3306/sony";
			String userName="root";
			String pass="root";
			Connection connection= DriverManager.getConnection(url, userName, pass);
			
			//3. create statements
			Statement statement = connection .createStatement();
			
			//4. execute query 
			//statement.execute("insert into details value (2,'Avi','avi123@gmail.com')");
			
			ResultSet rs=statement.executeQuery("SELECT * FROM sony.details");
			while(rs.next()) {
				System.out.println("id:"+rs.getInt(1)+"name:"+rs.getString(2)+"emailid:"+rs.getString(3));
			}
			
			//5. close the connection
			connection.close();
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		
		}
	}

}
