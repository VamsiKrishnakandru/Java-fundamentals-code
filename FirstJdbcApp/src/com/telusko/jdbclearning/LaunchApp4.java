package com.telusko.jdbclearning;

import java.sql.*;

public class LaunchApp4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jdbclearning";
		String username = "root";
		String password = "root123";
		Connection connect = DriverManager.getConnection(url, username, password);
		Statement statement = connect.createStatement();
		String sql = "DELETE FROM studentInfo WHERE id=1";
		int rowsAffected = statement.executeUpdate(sql);
		if(rowsAffected == 0)
			System.out.println("Delete operation failed");
		else
			System.out.println("Delete operation is successful");
		statement.close();
		connect.close();
	}
}
