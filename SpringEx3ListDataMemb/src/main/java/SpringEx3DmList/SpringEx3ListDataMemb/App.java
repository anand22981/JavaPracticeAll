package SpringEx3DmList.SpringEx3ListDataMemb;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext  cfg= new ClassPathXmlApplicationContext("config.xml");
    	Employee e=(Employee)cfg.getBean("emp");
    	System.out.println(e);
    }
}
