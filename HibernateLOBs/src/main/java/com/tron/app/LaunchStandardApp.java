package com.tron.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tron.model.StudentInfo;

public class LaunchStandardApp {

	public static void main(String[] args) 
	{
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(StudentInfo.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		boolean flag = false;
		FileInputStream fis = null;
		byte image[] = null;
		File file =null;
		FileReader reader = null;
		char textFile[] = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\kvams\\Desktop"
					+ "\\Telusko\\Java fundamentals code\\Java.JPG");
			image=new byte[fis.available()];
			fis.read(image);
			
			file = new File("C:\\Users\\kvams\\Desktop"
					+ "\\Telusko\\Java fundamentals code\\PersonalInfo.txt");
			reader=new FileReader(file);
			textFile=new char[(int)file.length()];
			reader.read(textFile);
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (Exception e1)
		{
			e1.printStackTrace();
		}
		
		StudentInfo student = new StudentInfo();
		student.setsName("Tron");
		student.setScity("Hyderabad");
		student.setImage(image);
		student.setTextfile(textFile);		
		
		try
		{
			transaction = session.beginTransaction();
			session.persist(student);
			flag=true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(flag==true)
				transaction.commit();
			else
				transaction.rollback();
			try {
				fis.close();
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			session.close();
			sessionFactory.close();
		}
	}

}
