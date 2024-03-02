package com.Spring.ex1.Springex1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//        Trainer t1;
//        t1=new JavaTrainer();
//        t1.tech();
//        t1.takeAttendence();
//        t1=new PythonTrainer();
//        t1.tech();
//        t1.takeAttendence();
//        
//        t1=new DBtrainer();
//        t1.tech();
//        t1.takeAttendence();
         ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
         Student s=(Student)ctx.getBean("st");
         System.out.println(s);
    }
}
