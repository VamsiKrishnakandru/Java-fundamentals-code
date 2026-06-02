package com.tshaped.services;

public class TronSkills 
{
	private ICourse course;
	
	public TronSkills(ICourse course)
	{
		System.out.println("Constructor injection");
		this.course = course;
	}
	
	public TronSkills()
	{
		System.out.println("TronSkills Bean created");
	}
	
	public void setCourse(ICourse course)
	{
		System.out.println("Setter is executed");
		this.course = course;
	}
	
	public Boolean buyTheCourse(Double amount)
	{
		return course.getTheCourse(amount);
	}
}
 