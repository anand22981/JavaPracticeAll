package runnableInterfaceMultithread;

import java.util.Scanner;

public class Addition implements Runnable
{
	public void run() 
	 {
		 try 
		 {
			 System.out.println("addition started.");
			 Scanner sc =  new Scanner(System.in);
			 System.out.println("enter a number");
			 int a= sc.nextInt();
			 System.out.println("enter second number");
			 int b =sc.nextInt();
			 int c=a+b;
			 sc.close();
			 Thread.sleep(3000);
			 System.out.println(c);
		 }
		 catch(Exception e) 
		 {
			 e.printStackTrace();
			 
		 }
		 System.out.println("addition completed");
	 }
}
