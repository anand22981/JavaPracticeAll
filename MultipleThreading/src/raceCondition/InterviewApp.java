package raceCondition;

public class InterviewApp {

	public static void main(String[] args)
	{
		Interview i = new Interview();
		Thread t1 = new Thread(i);
		Thread t2 = new Thread(i);
		Thread t3 = new Thread(i);
		
		t1.setName("asiu");
		t2.setName("Cristo");
		t3.setName("Martin");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
