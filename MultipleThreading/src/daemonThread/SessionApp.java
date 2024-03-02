package daemonThread;

public class SessionApp {

	public static void main(String[] args) {
		//making thread
		SessionConductance t1= new SessionConductance();
		AudioCheck t2 = new AudioCheck();
		ViedoCheck t3 = new ViedoCheck();
		//making daemon Thread 
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		//setting priority from 1 to 10
		t2.setPriority(1);
		t3.setPriority(1);
		
		//after that we run or start that thread 
		t1.start();
		t2.start();
		t3.start();
		
	//output	
//		Session is getting conducted
//		Video is gettng checked
//		Audio is gettng checked
//		Video is gettng checked
//		Session is getting conducted
//		Audio is gettng checked
//		Video is gettng checked
//		Session is getting conducted
//		Audio is gettng checked
//		Video is gettng checked
//		Session is getting conducted
//		Audio is gettng checked
//		Video is gettng checked
//		Audio is gettng checked
//		Session is getting conducted
//		Video is gettng checked
//		Audio is gettng checked
		
		
		
		
		
		
		
		
		
	}

}
