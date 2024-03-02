package multiThreadingOnSingleMethod;

public class JavaSessionApp {

	public static void main(String[] args) 
	{
		JavaSession js = new JavaSession();
		Thread t1= new Thread(js);
		Thread t2= new Thread(js);
		//changing name of threads
		t1.setName("ashiu");
		t2.setName("Cristo");
		//for starting thread
		t1.start();
		t2.start();

	}

}
