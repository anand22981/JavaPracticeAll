package curd.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CrudApp {

	public static void main(String[] args) 
	{
		 //create();
		//read();
		//update();
		delete();

	}
	public static void create() {
		Citizen c1=new Citizen(1001,"ASHIU",35);
		Citizen c2=new Citizen(1002,"cRISTO",25);
		Citizen c3=new Citizen(1003,"mARTIN",15);
		Citizen c4=new Citizen(1004,"HELLO",39);
		
		//hibernate code
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		
		
		sess.save(c1);
		sess.save(c2);
		sess.save(c3);
		sess.save(c4);
		tx.commit();
	}
public static void read() {
	Configuration cfg = new Configuration().configure();
	SessionFactory sf = cfg.buildSessionFactory();
	Session sess=sf.openSession();
	Transaction tx=sess.beginTransaction();
	
	//using get method it return null if not found
	//use when unsure of object exist
	Citizen c=sess.get(Citizen.class, 1001);
	System.out.println(c);
	
	//using load throw exception if not found
	
	Citizen c2=sess.load(Citizen.class, 1003);
	System.out.println(c2);
	tx.commit();
	}
public static void update() {
	Configuration cfg = new Configuration().configure();
	SessionFactory sf = cfg.buildSessionFactory();
	Session sess=sf.openSession();
	Transaction tx=sess.beginTransaction();
	
	Citizen c=sess.get(Citizen.class, 1004);
	c.setName("sleep");
	
	
	
	sess.save(c);
	tx.commit();
}
public static void delete() {
	Configuration cfg = new Configuration().configure();
	SessionFactory sf = cfg.buildSessionFactory();
	Session sess=sf.openSession();
	Transaction tx=sess.beginTransaction();
	Citizen c=sess.get(Citizen.class, 1004);
	
	
	sess.delete(c);
	
	tx.commit();
}

}
