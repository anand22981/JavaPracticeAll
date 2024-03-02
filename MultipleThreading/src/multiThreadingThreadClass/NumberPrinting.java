package multiThreadingThreadClass;

public class NumberPrinting extends Thread
{
	public void run() {
		System.out.println("number printing started");
    try {
	for(int i=0;i<=4;i++) 
	{
		System.out.println(i);
		Thread.sleep(3000);
	}
}
catch(Exception e) 
    {
	e.printStackTrace();
}
    System.out.println("number printing completed");
}
}
