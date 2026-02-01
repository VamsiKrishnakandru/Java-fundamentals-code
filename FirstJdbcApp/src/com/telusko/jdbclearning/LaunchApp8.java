package com.telusko.jdbclearning;

import java.sql.*;
import java.util.Scanner;

public class LaunchApp8 {

	public static void main(String[] args) 
	{
		PreparedStatement pstmt = null;
		Connection connect = null;
		String sql = "UPDATE studentInfo SET sage=? WHERE id=?;";
		try {
			connect = JdbcUtil.setConnection();
			pstmt = connect.prepareStatement(sql);
			System.out.print("Enter the Id where you want to update the age: ");
			Scanner scan = new Scanner(System.in);
			int id = scan.nextInt();
			System.out.print("Enter the new age: ");
			int age = scan.nextInt();
			pstmt.setInt(1, age);
			pstmt.setInt(2, id);
			int rowsaffected = pstmt.executeUpdate();
			if(rowsaffected == 0)
				System.out.println("Updation failed");
			else
				System.out.println("Updation was successful");
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
