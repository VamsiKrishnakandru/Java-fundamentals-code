package com.tshaped.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tshaped.services.TronSkills;

public class LaunchApp3 {

	public static void main(String[] args) 
	{
		//Application Context
		
				ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
				TronSkills t = container.getBean(TronSkills.class);
				boolean status = t.buyTheCourse(453.2);
				if(status)
					System.out.println("Course is purchased");
				else
					System.out.println("Error");
	}

}
