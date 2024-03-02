package demo.comhiber;


import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Bike b1 = new Bike();
    	Bike b2 = new Bike();
    	Bike b3 = new Bike();
    	
    	Student st1=new Student(1,"Martin",2005,b1);
    	Student st2=new Student(2,"Ashiu",2019,b2);
    	Student st3=new Student(3,"Cristo",2023,b3);
    	
    	b1.setBikeId(1001);
    	b1.setBikeBrand("Honda");
    	b1.setBikePrize(50000);
    	b1.setStud(st1);
    	
    	b2.setBikeId(1002);
    	b2.setBikeBrand("Ktm");
    	b2.setBikePrize(150000);
    	b2.setStud(st2);
    	
    	b3.setBikeId(1003);
    	b3.setBikeBrand("Bullet");
    	b3.setBikePrize(140000);
    	b3.setStud(st3);
    	
    	
    	
        Configuration cfg=new Configuration();
        cfg.configure();//cfg.configure("hibernate.cfg.xml");
        
        SessionFactory  factory= cfg.buildSessionFactory();
        Session sess=factory.openSession();
        
        org.hibernate.Transaction t =sess.beginTransaction();
        sess.save(st1);
        sess.save(st2);
        sess.save(st3);
        sess.save(b1);
        sess.save(b2);
        sess.save(b3);
        
        
        t.commit();
    
    }
}
