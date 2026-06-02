package com.tron.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tron.model.Student;

public class GetRecordApp {

	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).
		buildSessionFactory();
		Session session = null;
		
		try
		{
			session = sessionFactory.openSession();
			//Student student = session.get(Student.class, 1);
			Student student = session.getReference(Student.class, 44);
			if(student!=null)
			{
			System.out.println("Id is : " + student.getSid());
			System.out.println("Name is : " + student.getsName());
			System.out.println("City is : " + student.getScity());
			//System.out.println(student);
			}
			else
			{
				System.out.println("There is no data/record with given id");
			}
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
			session.close();
			sessionFactory.close();
		}
	}

}
