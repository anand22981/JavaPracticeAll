package watingMainThread;

public class JavaSession implements Runnable
{
 public void run() 
 {
	try 
	{
		System.out.println("Student joined the session");
		for(int i=1;i<=5;i++) 
		{
			System.out.println("student is attending session");
			Thread.sleep(2000);
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
 }
}
