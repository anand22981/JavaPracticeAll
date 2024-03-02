package daemonThread;

public class SessionConductance  extends Thread
{
public void run() 
{
	try 
	{
		for(int i=1;i<=5;i++) 
		{
			System.out.println("Session is getting conducted");
			Thread.sleep(2000);
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
}
}
