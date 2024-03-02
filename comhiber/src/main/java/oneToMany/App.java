package oneToMany;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) 
	{
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
		
		Customer c1 = new Customer(1,"Deep","Bihar",pList1);
		Customer c2 = new Customer(2,"Martin","Gwalior",pList2);
		
		p1.setpId(111);
		p1.setpName("Laptop");
		p1.setpPrice(350000);
		p1.setCust(c1);
		
		p2.setpId(222);
		p2.setpName("washing");
		p2.setpPrice(5000);
		p2.setCust(c1);
		
		p3.setpId(333);
		p3.setpName("mobile");
		p3.setpPrice(150000);
		p3.setCust(c2);
		
		p4.setpId(444);
		p4.setpName("Car");
		p4.setpPrice(950000);
		p4.setCust(c2);
		
		//Configuration cfg = new Configuration().configure();
		Configuration cfg=new Configuration().configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction t=session.beginTransaction();
        session.save(p1);
        session.save(p2);
        session.save(p3);
        session.save(p4);
        session.save(c1);
        session.save(c2);
        t.commit();
	}

}
