package com.telusko.jdbclearning;

import java.sql.*;

public class LaunchApp3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/jdbclearning";
		String username = "root";
		String password = "root123";
		Connection connect = DriverManager.getConnection(url, username, password);
		
		Statement statement = connect.createStatement();
		
		//executeQuery for Retrieving Data (SELECT command)
		//Using methods of ResultSet we can process the data.
		String sql = "SELECT * FROM studentInfo;";
		ResultSet rs = statement.executeQuery(sql); //returns result set
		
		while(rs.next()) //don't forget this
		{
			//can use either index like above or column names
			//need to remember the data type of the column
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " 
					+ rs.getInt(3) + " "+ rs.getString(4));
		}
		
		rs.close(); //close result set
		statement.close();
		connect.close();
	}
}
