package raceCondition;

public class Interview implements Runnable
{
synchronized public void run() 
{
	String name = Thread.currentThread().getName();
	try 
	{
		for(int i=1;i<=5;i++) 
		{
			System.out.println(name+" is atttending interview");
			Thread.sleep(2000);
		}
	}
	catch(Exception e) 
	{
		e.printStackTrace();
	}
}
}
