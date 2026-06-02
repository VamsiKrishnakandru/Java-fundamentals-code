package com.tshaped.services;

public class SpringBoot implements ICourse 
{
	public SpringBoot()
	{
		System.out.println("SpringBoot Bean created");
	}
	
	@Override
	public Boolean getTheCourse(Double price)
	{
		System.out.println("SpringBoot Course is Purchased successfully and fees paid is " + price);
		return true;
	}
}
 