package com.telusko.jdbclearning;
import java.sql.*; 

public class LaunchApp1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//Load and Register JDBC Driver
		//Class.forName is used load a specific class - during which static blocks will be executed.
		//static block has code to register the driver i.e., below line
		//DriverManger.registerDriver(new com.mysql.cj.jdbc.Driver()); - can be used alternatively
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		//Establish the connection
		String url="jdbc:mysql://localhost:3306/jdbclearning";
		String user="root";
		String password="root123";
		Connection connect = DriverManager.getConnection(url, user, password);
		
		//creating statement
		Statement statement = connect.createStatement();
		
		//execute query
		//Here we are hard coding the values
		//to see changes in workbench - tick the new connections auto commit option in preferences. 
		String sql = "INSERT INTO studentInfo (id, sname, sage, scity) VALUES (1, 'Rohit', 20, 'Pune');";
		int rowsAffected = statement.executeUpdate(sql); //For non-SELECT commands use executeUpdate method
		
		//process the result
		if(rowsAffected == 0)
		{
			System.out.println("Unable to insert the data");
		}
		else
		{
			System.out.println("Data Inserted Successfully!");
		}
		
		//close the resources - don't forget
		statement.close();
		connect.close();
	}

}
