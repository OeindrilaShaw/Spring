package com.pack;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=null;
		try{
			t=s.beginTransaction();
			Vendor v=new Vendor();
			v.setVendorid(121);
			v.setVname("pupu");
			Customer c1= new Customer();
			c1.setId(123);
			c1.setName("pupui");
			Customer c2= new Customer();
			c2.setId(124);
			c2.setName("pupui");
			Set s1=new HashSet();
			s1.add(c1);
			s1.add(c2);
			v.setCustomer(s1);
			s.save(v);
			t.commit();
			System.out.println("success");
			
		}
		catch(HibernateException ex)
		{
			System.out.println(ex);
		}
		finally{
			s.close();
		}
	}

}
