package withOutDaemonThread;

public class SessionCondutance extends Thread
{
public void run() 
{
	try
	{
		for(int i=1;i<=5;i++) {
			System.out.println("Session getting conducted");
			Thread.sleep(3000);
		}
			
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
