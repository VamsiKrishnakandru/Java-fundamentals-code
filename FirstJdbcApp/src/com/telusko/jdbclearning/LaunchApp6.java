package com.telusko.jdbclearning;

import java.sql.*;

public class LaunchApp6 {
	public static void main(String[] args) {
		Connection connect = null; //put them outside try block to use them in finally 
		Statement statement = null;
		try
		{
			connect = JdbcUtil.setConnection(); //util class static method
			statement = connect.createStatement();
			String sql = "INSERT INTO studentInfo (id, sname, sage, scity) VALUES (1, 'Rohit', 20, 'Pune');";
			int rowsAffected = statement.executeUpdate(sql);
			if(rowsAffected == 0)
			{
				System.out.println("Unable to insert the data");
			}
			else
			{
				System.out.println("Data Inserted Successfully!");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				JdbcUtil.closeConnection(connect, statement); //util class static method
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
