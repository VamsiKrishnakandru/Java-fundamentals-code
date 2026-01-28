package com.telusko.jdbclearning;

import java.sql.*;

public class LaunchApp5 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jdbclearning";
		String username = "root";
		String password = "root123";
		Connection connect = DriverManager.getConnection(url, username, password);
		Statement statement = connect.createStatement();
		String sql = "SELECT * FROM studentInfo;";
		//status is true for select command and false for other commands
		boolean status = statement.execute(sql);
		if(status)
		{
			//select 
			ResultSet rs = statement.getResultSet();
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " 
					+ rs.getInt(3) + " "+ rs.getString(4));
			}
			rs.close();
		}
		else
		{
			//insert, update, delete
			int rowsAffected = statement.getUpdateCount();
			if(rowsAffected == 0)
				System.out.println("Operation failed");
			else
				System.out.println("Operation success");
		}
		statement.close();
		connect.close();		
	}
}
