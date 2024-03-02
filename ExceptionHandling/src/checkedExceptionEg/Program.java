package checkedExceptionEg;

public class Program 
{
 void checked() 
 {
	 for(int i=0;i<5;i++) 
	 {
		 System.out.println("java is learning");
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	 }
	 
 }
}
