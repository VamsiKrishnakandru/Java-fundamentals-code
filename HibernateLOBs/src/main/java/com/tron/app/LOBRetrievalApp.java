package com.tron.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tron.model.StudentInfo;

public class LOBRetrievalApp {

	public static void main(String[] args) 
	{
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(StudentInfo.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		StudentInfo studentInfo = session.get(StudentInfo.class, 1);
		FileOutputStream fos = null;
		FileWriter writer = null;
				
		try 
		{
			fos = new FileOutputStream("Java.JPG");
			writer = new FileWriter("PersonalInfo.txt");
			fos.write(studentInfo.getImage());
			writer.write(studentInfo.getTextfile());
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (Exception e1)
		{
			e1.printStackTrace();
		}	
		finally
		{
			try {
				fos.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			session.close();
			sessionFactory.close();
		}
	}

}
