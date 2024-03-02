package synchronizedLockBlock;

public class Library extends Thread
{
	String book1="Java";
	String book2="Python";
	String book3="Sql";
public void run() 
{
	if(getName().equals("ashiu")) 
	{
		ashiuThread();
	}
	else 
	{
		cristoThread();
	}
}

void ashiuThread()
{
	try 
	{
		synchronized(book1) 
		{
			System.out.println("ashiu is learning "+book1);
			Thread.sleep(3000);
			synchronized(book2) 
			{
				System.out.println("ashiu is learning "+book2);
				Thread.sleep(3000);
				synchronized(book3) 
				{
					System.out.println("ashiu is learning "+book3);
					Thread.sleep(3000);
		}//relize the lock
				}//relize the lock
			}//relize the lock
	}
	catch(Exception e) 
	{
		e.printStackTrace();
	}}
	
void cristoThread() 
{
	try 
	{
		synchronized(book1) 
		{
			System.out.println("Cristo is learning "+book1);
			Thread.sleep(3000);
			synchronized(book2) 
			{
				System.out.println("Cristo is learning "+book2);
				Thread.sleep(3000);
				synchronized(book3) 
				{
					System.out.println("Cristo is learning "+book3);
					Thread.sleep(3000);
		}
				}
			}
	
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
}














