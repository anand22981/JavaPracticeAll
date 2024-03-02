package withOutDaemonThread;

public class SessionApp 
{
    public static void main(String[] args) 
    {
    	SessionCondutance t1 = new SessionCondutance();
        AudioCheck t2 = new AudioCheck();
        VideoCheck t3 = new VideoCheck();
        
        t1.start();
        t2.start();
        t3.start();
	}
    
   
    
}
