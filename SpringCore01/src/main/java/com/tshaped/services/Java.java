package com.tshaped.services;

public class Java implements ICourse
{
	
	public Java()
	{
		System.out.println("Java Bean created");
	}
	
	@Override
	public Boolean getTheCourse(Double price)
	{
		System.out.println("Java Course is Purchased successfully and fees paid is " + price);
		return true;
	}

}
