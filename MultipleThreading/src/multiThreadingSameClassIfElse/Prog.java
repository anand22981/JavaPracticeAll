package multiThreadingSameClassIfElse;

import java.util.Scanner;

public class Prog extends Thread
{
public void run() 
{
	if(getName().equals("Add")) 
	{
		add();
	}
	else {
		printing();
	}
}

public void add() 
{
	try
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a= sc.nextInt();
		System.out.println("enter a number");
		int b=sc.nextInt();
		int c = a+b;
		Thread.sleep(2000);
		System.out.println(c);
	}
	catch(Exception e) 
	{
		e.printStackTrace();
	}
}

public void printing() 
{
	try
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(2000);
		}
		
		Thread.sleep(2000);
		
	}
	catch(Exception e) 
	{
		e.printStackTrace();
	}
}
















}
