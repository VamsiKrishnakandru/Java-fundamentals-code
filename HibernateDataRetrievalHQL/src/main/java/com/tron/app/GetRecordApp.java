package com.tron.app;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tron.model.Student;

public class GetRecordApp {

	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = new Configuration().configure().
				addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session1 = null;
		try
		{
			session1=sessionFactory.openSession();
			//SELECT * FROM studenttable WHERE scity=?;
			//complete loading - entire object is returned
			//Query<Student> query = session1.
					//createQuery("FROM Student WHERE scity=:city", 
					//Student.class);
			//partial loading - only a column is retrieved 
			Query<String> query = session1.
					createQuery("SELECT sName FROM Student WHERE scity=:city",
							String.class);
			query.setParameter("city", "Mumbai");
			//List<Student> listStudent = query.list();
			List<String> listStudent = query.list();
			//for(Student s: listStudent)
			for(String s: listStudent)
			{
				System.out.println(s);
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
			session1.close();
			sessionFactory.close();
		}
	}

}
