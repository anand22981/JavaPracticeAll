package com.hibernate.ex2.HibernateProj2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg= new Configuration();
       cfg.configure();
       SessionFactory factory=cfg.buildSessionFactory();
       
       Session session = factory.openSession();
   	   Transaction trans=session.beginTransaction();
   	   
   	   //creating object of bike classs
   	   Bike b1 = new Bike(111,"honda","blue");
	   Bike b2 = new Bike(112,"Ktm","black");
	   Bike b3 = new Bike(113,"Duke","white");
	   
	 //creating object of student classs
   	   Studentex2 st = new Studentex2(10,"ashiu",24,b1);
   	   Studentex2 s1 = new Studentex2(11,"cristo",55,b2);
   	   Studentex2 s2 = new Studentex2(12,"martin",22,b3);
   	   
   	   //saving the bike object
   	   session.save(b1);
	   session.save(b2);
	   session.save(b3);
   	   
	   //saving the student
   	   session.save(st);
   	   session.save(s1);
   	   session.save(s2);
   	   
   	   trans.commit();
   	   System.out.println("Student object saved");
       
       
    }
}
