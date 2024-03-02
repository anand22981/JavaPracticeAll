package Spring.AutoWiringUsingAnnotation.spring.AutowiringUsINGaNNotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext cfx = new ClassPathXmlApplicationContext("config.xml");
        car c=(car)cfx.getBean("car");
        System.out.println(c);
        
        System.out.println("_-----_---->");
        
    	
    	
    	
    	
    	
    	
    	
    }
}
