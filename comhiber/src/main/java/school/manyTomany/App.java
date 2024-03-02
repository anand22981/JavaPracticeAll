package school.manyTomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Teacher t1=new Teacher();
		Teacher t2=new Teacher();
		Teacher t3=new Teacher();
		
		//List of teavher of java(s1) and aptitide
		List<Teacher> tlist1=new ArrayList<Teacher>();
		 tlist1.add(t1);//ayush
		 tlist1.add(t3);//Kushal
		//testing sub(s2)
		 List<Teacher> tlist2=new ArrayList<Teacher>();
		 tlist2.add(t1);//ayush
		 tlist2.add(t2);//Deep
		 
		 //sql 
		 List<Teacher> tlist3=new ArrayList<Teacher>();
		 tlist3.add(t2);//deep
		 tlist3.add(t3);//Kushal
		 
		//aptitude
//		 List<Teacher> tlist4=new ArrayList<Teacher>();
//		 tlist4.add(t1);//ayush
//		 tlist4.add(t3);//Kushal
		 
		 Subject s1 = new Subject(101,"Java",tlist1);
		 Subject s2 = new Subject(102,"Testing",tlist2);
		 Subject s3 = new Subject(103,"sql",tlist3);
		 Subject s4 = new Subject(104,"aptitude",tlist1);
		 
		 //list of subjects for ayush(t1)
		 List<Subject> slist1=new ArrayList<Subject>();
		 slist1.add(s1);
		 slist1.add(s2);
		 slist1.add(s4);
		//list of subjects for deep(t2)
		 List<Subject> slist2=new ArrayList<Subject>();
		 
		 slist2.add(s2);
		 slist2.add(s3);
		 
		 //t3 kushal
		 List<Subject> slist3=new ArrayList<Subject>();
		 slist3.add(s1);
		 slist3.add(s4);
		 
		 t1.setId(1);
		 t1.setName("Ayush");
		 t1.setsList(slist1);
		 
		 

		 t2.setId(2);
		 t2.setName("Deep");
		 t2.setsList(slist2);
		 
		 
		 

		 t3.setId(3);
		 t3.setName("kushal");
		 t3.setsList(slist3);
		 
		 
		 Configuration cfg= new Configuration().configure();
		 SessionFactory factory=cfg.buildSessionFactory();
		 Session session = factory.openSession();
		 
		 Transaction tx=session.beginTransaction();
		 session.save(s1);
		 session.save(s2);
		 session.save(s3);
		 session.save(s4);
		 
		 session.save(t1);
		 session.save(t2);
		 session.save(t3);
		 
		 tx.commit();
		 
	}

}
