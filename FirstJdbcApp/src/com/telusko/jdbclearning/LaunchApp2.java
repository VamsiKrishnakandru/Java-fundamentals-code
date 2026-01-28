package com.telusko.jdbclearning;

import java.sql.*;

public class LaunchApp2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jdbclearning";
		String username = "root";
		String password = "root123";
		Connection connect = DriverManager.getConnection(url, username, password);
		Statement statement = connect.createStatement();
		String sql = "UPDATE studentInfo SET sage=22 WHERE id=2;";
		System.out.println(statement.executeUpdate(sql));
		statement.close();
		connect.close(); 
	}
}
