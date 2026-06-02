package com.tshaped.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.tshaped.services.TronSkills;

public class LaunchApp2 
{
	public static void main(String[] args) 
	{
		
		//BeanFactory
		DefaultListableBeanFactory container = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader read = new XmlBeanDefinitionReader(container);
		read.loadBeanDefinitions("applicationconfig.xml");
		TronSkills t = container.getBean(TronSkills.class);
		boolean status = t.buyTheCourse(453.2);
		if(status)
			System.out.println("Course is purchased");
		else
			System.out.println("Error");
	}
}
