package daemonThread;

public class ViedoCheck extends Thread
{
	public void run() 
	{
		try 
		{
			//for making daemon thread we have to make is infinity loop
			for(;;) 
			{
				System.out.println("Video is gettng checked");
				Thread.sleep(2000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
