package com.tron.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tron.model.Employee1;

public class LaunchSelective {

	public static void main(String[] args) 
	{
		SessionFactory sessionfactory = new Configuration().configure().
				addAnnotatedClass(Employee1.class).buildSessionFactory();
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		
		try
		{
			session = sessionfactory.openSession();
			transaction = session.beginTransaction();
			
			Employee1 e = new Employee1();
			e.setEage(17);
			e.setEid(1);
			e.seteName("Rohan");
			e.setEcity("HYD");
			session.persist(e);
			flag = true;
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
			session.close();
			sessionfactory.close();
		}
	}

}
