package mySpring.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    	
    	
    	SchoolDE k=(SchoolDE)ctx.getBean("kod");
    	System.out.println(k);
    	
    	
    	
    	
    	
//    	Student s = (Student) ctx.getBean("st");
//    	Student s1 = (Student) ctx.getBean("st1");
//    	System.out.println(s);
//    	System.out.println(s1);
    	
    	
    	
    	
    }
}
