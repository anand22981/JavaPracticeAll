package runnableInterfaceMultithread;

public class MultiThreadApp {

	public static void main(String[] args) {
		Addition a = new Addition();
		NumberPrint np = new NumberPrint();
		//for interface we have to create thread object too
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(np);
		//in this given programme we can't tell who is executing first 
		t1.start();
		t2.start();
	}

}
