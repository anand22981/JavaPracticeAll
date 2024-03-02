package com.hibernate.Proj3.HibernateProj3;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg =new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		Product p4=new Product();
		
		List<Product> pList1 = new ArrayList<Product>();
		pList1.add(p1);
		pList1.add(p2);
		
		List<Product> pList2 = new ArrayList<Product>();
		pList2.add(p3);
		pList2.add(p4);
		
		Customer c1 = new Customer(111,"ashiu",24,pList1);
		Customer c2 = new Customer(112,"cristo",25,pList2);
		
		
		p1.setP_id(01);
		p1.setP_name("Mobile");
		p1.setP_cost(20000);
		p1.setCst(c1);
		
		p2.setP_id(02);
		p2.setP_name("Laptop");
		p2.setP_cost(50000);
		p1.setCst(c1);
		
		p3.setP_id(03);
		p3.setP_name("bike");
		p3.setP_cost(150000);
		p1.setCst(c2);
		
		p4.setP_id(04);
		p4.setP_name("Car");
		p4.setP_cost(250000);
		p1.setCst(c2);
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		session.save(c1);
		session.save(c2);
		
		trans.commit();
		System.out.println("insert successfully:)");
		
		
    }
}
