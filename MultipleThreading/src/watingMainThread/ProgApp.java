package watingMainThread;

public class ProgApp {

	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("java session start");
			JavaSession js = new JavaSession();
			Thread t1 = new Thread(js);
			t1.start();
			t1.join();//used for wating or stop main thread and first execute t1 thread then go to java end 
			System.out.println("java session end ");
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}

	}

}
