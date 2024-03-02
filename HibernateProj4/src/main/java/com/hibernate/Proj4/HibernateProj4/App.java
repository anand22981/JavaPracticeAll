package com.hibernate.Proj4.HibernateProj4;

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
    	
    	Configuration cfg = new Configuration();
    	cfg.configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session=factory.openSession();
    	Transaction tran=session.beginTransaction();
    	
    	//creating list for storing employee
    	List<Employee> emplist1 = new ArrayList<Employee>();
    	List<Employee> emplist2 = new ArrayList<Employee>();
    	List<Employee> emplist3 = new ArrayList<Employee>();
    	List<Employee> emplist4 = new ArrayList<Employee>();
    	
    	//Creating the Employee Object   	
    	Employee e1 = new Employee();
    	Employee e2 = new Employee();
    	Employee e3 = new Employee();
    	Employee e4 = new Employee();
    	Employee e5 = new Employee();
    	//Adding the employee Object to Emp1;
    	emplist1.add(e1);
    	emplist1.add(e3);
    	emplist1.add(e5);
    	//Adding the employee Object to Emp2list;
    	emplist2.add(e1);
    	emplist2.add(e2);
    	emplist2.add(e4);
    	emplist2.add(e5);
    	
    	//Adding the employee Object to Emp3list;
    	emplist3.add(e2);
    	emplist3.add(e4);
    	emplist3.add(e5);
    	
    	//Adding the employee Object to Emp4list;
    	emplist4.add(e1);
    	emplist4.add(e2);
    	emplist4.add(e3);
    	emplist4.add(e4);
    	emplist4.add(e5);
    	
    	
    	
    	List<Technology> techlst1=new ArrayList<Technology>();
    	List<Technology> techlst2=new ArrayList<Technology>();
    	List<Technology> techlst3=new ArrayList<Technology>();
    	List<Technology> techlst4=new ArrayList<Technology>();
    	List<Technology> techlst5=new ArrayList<Technology>();
    	
    	//Creating the object of technology
    	Technology t1 = new Technology();
    	Technology t2 = new Technology();
    	Technology t3 = new Technology();
    	Technology t4 = new Technology();
    	
    	//Adding the technology object to techList1
    	techlst1.add(t1);
    	techlst1.add(t2);
    	techlst1.add(t4);
    	//Adding the technology object to techList1
    	techlst2.add(t2);
    	techlst2.add(t3);
    	techlst2.add(t4);
    	
    	//Adding the technology object to techList1
    	techlst3.add(t1);
    	techlst3.add(t4);
    	
    	//Adding the technology object to techList1
    	techlst4.add(t2);
    	techlst4.add(t3);
    	techlst4.add(t4);
    	
    	//Adding the technology object to techList1
    	techlst5.add(t1);
    	techlst5.add(t2);
    	techlst5.add(t3);
    	techlst5.add(t4);
    	
    	e1.setE_id(11);
    	e1.setName("ashiu");
    	e1.setE_team("Team-A");
    	
    	e2.setE_id(12);
    	e2.setName("Praveen");
    	e2.setE_team("Team-B");
    	
    	e3.setE_id(13);
    	e3.setName("Pooja");
    	e3.setE_team("Team-C");


    	e4.setE_id(14);
    	e4.setName("Priya");
    	e4.setE_team("Team-A");
    	
    	e5.setE_id(15);
    	e5.setName("Parteek");
    	e5.setE_team("Team-B");
    	
    	t1.setT_id(123);
    	t1.setT_name("Java");
    	t1.setEmp(emplist1);
    	
    	t2.setT_id(124);
    	t2.setT_name("python");
    	t2.setEmp(emplist2);
    	
    	t3.setT_id(125);
    	t3.setT_name("React");
    	t3.setEmp(emplist3);
    	
    	t4.setT_id(126);
    	t4.setT_name("Mysql");
    	t4.setEmp(emplist4);
    	
    	session.save(e1);
    	session.save(e2);
    	session.save(e3);
    	session.save(e4);
    	
    	session.save(t1);
    	session.save(t2);
    	session.save(t3);
    	session.save(t4);
    	
    	
    	tran.commit();
    	System.out.println("object saved");
    }
}
