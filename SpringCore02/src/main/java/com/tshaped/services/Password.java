package com.tshaped.services;

public class Password 
{
	public Password()
	{
		System.out.println("Password Bean created");
	}
	
	public String createPassword(String password)
	{
		return "Password has been created: " + password;
	}

}
