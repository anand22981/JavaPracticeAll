package duckingException;

import java.util.Scanner;

public class Program1 
{
void display1() throws Exception
{
	System.out.println("disp1 execution started.");
	 Scanner sc = new Scanner(System.in); 
	 System.out.println("enter first number");
	 int a=sc.nextInt();
	 System.out.println("enter second number");
	 int b=sc.nextInt();
	 int c= a/b;
	 System.out.println(c);
	 sc.close();
}
}
