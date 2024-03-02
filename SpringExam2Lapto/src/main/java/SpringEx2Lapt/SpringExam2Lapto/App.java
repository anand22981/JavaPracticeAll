package SpringEx2Lapt.SpringExam2Lapto;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext cfx = new ClassPathXmlApplicationContext("config.xml");
        Laptop l=(Laptop)cfx.getBean("l1");
       Laptop l1=(Laptop)cfx.getBean("l2");
        System.out.println(l);
       System.out.println(l1);
    }
}
