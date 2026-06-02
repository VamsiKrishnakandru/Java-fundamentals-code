package com.tron.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tron.model.Student;

public class LaunchUpdate {

	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = new Configuration().
				addAnnotatedClass(Student.class).configure().buildSessionFactory();
		Session session = null;
		Transaction transaction = null;
		boolean flag = true;
		int count = 0;
		try
		{
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			count = session.createMutationQuery("UPDATE Student SET scity=:city")
			.setParameter("city", "Delhi").executeUpdate();
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
			if(flag)
				transaction.commit();
			else
				transaction.rollback();
			System.out.println("Number of rows updated: " + count);
			session.close();
			sessionFactory.close();
		}

	}

}
