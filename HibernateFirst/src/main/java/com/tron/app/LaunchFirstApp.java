package com.tron.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tron.model.Student;

public class LaunchFirstApp {

	public static void main(String[] args) 
	{
		//Step 1 - configuration object
		Configuration config = new Configuration();
		
		//Step 2 - configure hibernate.cfg.xml file to configuration obj
		//config.configure("hib.config.xml"); - specify only if file is differently named
		config.configure();
		
		//Step 3 - Create SessionFactory object
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		//Step 4 - get the session obj from sessionfactory
		Session session=sessionFactory.openSession();
		
		//Step 5 - Begin transaction within Session
		Transaction transaction = session.beginTransaction();
		
		Student student = new Student();
		student.setSid(1);
		student.setsName("Rohan");
		student.setScity("Hyderabad");
		
		//if we are creating a new table then add below in xml- 
		//<property name="hibernate.hbm2ddl.auto">create</property>
		//if a table with same name already exists then it will be replaced
		//if we want to update an existing table -
		//<property name="hibernate.hbm2ddl.auto">update</property>
		
		//Add below in xml to specify the class
		//<mapping class="com.telusko.model.Student"/>
		
		//Add below to see the SQL query in console
		//<property name="hibernate.show_sql">true</property>
        //<property name="hibernate.format_sql">true</property>
		
		//Step 6 - perform operation
		session.persist(student);
		transaction.commit();
		
		//Step 7 - close the session
		session.close();
	}

}
