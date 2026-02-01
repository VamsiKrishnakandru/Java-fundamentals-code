package com.telusko.jdbclearning;

import java.sql.*;

public class LaunchApp10 {

	public static void main(String[] args) 
	{
		Connection connect = null;
		PreparedStatement pstmt = null;
		String sql = "UPDATE studentInfo SET sage=? WHERE id=?;";
		try {
			connect = JdbcUtil.setConnection();
			pstmt = connect.prepareStatement(sql);
			pstmt.setInt(2,1);
			pstmt.setInt(1,28);
			pstmt.addBatch();
			pstmt.setInt(2,2);
			pstmt.setInt(1,30);
			pstmt.addBatch();
			pstmt.executeBatch();
			System.out.println("Check in DB.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				JdbcUtil.closeConnection(connect, pstmt);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
