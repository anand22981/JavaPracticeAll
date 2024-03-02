package threadCurrentThread;

public class Prog {

	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println(t);//Thread[Thread-0,5,main]
		//thread name change
		t.setName("ashiu");
		System.out.println(t);//Thread[ashiu,5,main]
		//priority name changed
		t.setPriority(4);
		System.out.println(t);//Thread[ashiu,4,main]
		//we cannot change stack name the last main
	}

}
