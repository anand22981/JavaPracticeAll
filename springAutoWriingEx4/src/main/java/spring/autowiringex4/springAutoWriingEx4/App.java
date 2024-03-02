package spring.autowiringex4.springAutoWriingEx4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext cfx=new ClassPathXmlApplicationContext("config.xml");
    	Person p=(Person)cfx.getBean("p1");
    	System.out.println(p);
    }
}
