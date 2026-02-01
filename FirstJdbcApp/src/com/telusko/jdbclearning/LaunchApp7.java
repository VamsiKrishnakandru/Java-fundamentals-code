package com.telusko.jdbclearning;

import java.sql.*;

public class LaunchApp7 {

	public static void main(String[] args) 
	{
		String sql = "INSERT INTO studentinfo (id, sname, sage, scity) VALUES (?, ?, ?, ?);";
		Connection connect = null;
		PreparedStatement prestmt = null;
		try 
		{
			connect = JdbcUtil.setConnection();
		    prestmt = connect.prepareStatement(sql); //sql query is given while preparing the statement.
		    prestmt.setInt(1, 3); //1st para - 1st value in para Sql, 2nd para - value.
		    prestmt.setString(2, "Roshan");
		    prestmt.setInt(3, 24);
		    prestmt.setString(4, "Hyderabad");
			int rowsaffected = prestmt.executeUpdate();
			if(rowsaffected != 0)
				System.out.println("Data entry was successful.");
			else
				System.out.println("Data entry not successful.");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			try {
				JdbcUtil.closeConnection(connect, prestmt);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
				
	}

}
