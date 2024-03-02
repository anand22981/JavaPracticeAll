package springObjectBeanex4.springObjectBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext cfx=new ClassPathXmlApplicationContext("config.xml");
        Trainer tr=(Trainer)cfx.getBean("train1");
        System.out.println(tr);
        
        StudentClass st=(StudentClass)cfx.getBean("sc1");
        System.out.println(st);
    
    
    
    
    
    }
}
