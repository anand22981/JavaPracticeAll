package daemonThread;

public class AudioCheck extends Thread
{
	public void run() 
	{
		try 
		{
			for(;;) 
			{
				System.out.println("Audio is gettng checked");
				Thread.sleep(2000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
