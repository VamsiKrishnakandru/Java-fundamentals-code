package com.tshaped.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tshaped.services.Password;

public class LaunchApp {

	public static void main(String[] args) 
	{
		
		//Application Context
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
		Password pass = container.getBean(Password.class);
		System.out.println(pass.createPassword("Tron"));
	}

}
		