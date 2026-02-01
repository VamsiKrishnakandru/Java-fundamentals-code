package com.telusko.jdbclearning;

import java.sql.*;
import java.util.Scanner;

public class LaunchApp9 {

	public static void main(String[] args) 
	{
		Connection connect = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		String sql = "DELETE FROM studentinfo WHERE id=?";
		String sql1 = "SELECT id, sname, sage, scity FROM studentInfo WHERE id=?";
		try {
			connect = JdbcUtil.setConnection();
			pstmt1 = connect.prepareStatement(sql);
			pstmt2 = connect.prepareStatement(sql1);
			System.out.print("Enter the id of the record which you want to delete: ");
			Scanner scan = new Scanner(System.in);
			int id = scan.nextInt();
			System.out.println("Enter the id of the record you want to fetch: ");
			int id1 = scan.nextInt();
			pstmt1.setInt(1, id);
			pstmt2.setInt(1, id1);
			int rowsAffected = pstmt1.executeUpdate();
			if(rowsAffected == 0)
				System.out.println("Deletion operation failed");
			else
				System.out.println("Deletion operation was successful");
			ResultSet rs = pstmt2.executeQuery();
			if(rs.next())
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4));
			else
				System.out.println("Retrieving operation failed.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				JdbcUtil.closeConnection(connect, pstmt1);
				pstmt2.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
