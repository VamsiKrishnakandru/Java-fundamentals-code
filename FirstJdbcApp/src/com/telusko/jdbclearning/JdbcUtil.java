package com.telusko.jdbclearning;

import java.sql.*;

public class JdbcUtil {
	static //very important
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection setConnection() throws SQLException //implementing class will handle
	{
		String url = "jdbc:mysql://localhost:3306/jdbclearning";
		String username = "root";
		String password = "root123";
		return DriverManager.getConnection(url, username, password);
	}
	public static void closeConnection(Connection connect, Statement statement) throws SQLException
	{
		statement.close();
		connect.close();
	}
}
