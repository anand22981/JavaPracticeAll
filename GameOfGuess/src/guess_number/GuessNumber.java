package guess_number;
import java.util.*;
public class GuessNumber {
    public  void guess(int a) 
    
    {
    	Scanner sc= new Scanner(System.in);
    	int count=0;
    	boolean b=true;
	    System.out.println("enter a number between 1 to 100 :");
	   while(b){ //we can use both for and while
	    	//for(;b;) {
	       int user = sc.nextInt();
	       count++;
	       if(user==a)
	       {
	           b=false;
	       }
	       else if(user>a)
	       {
	           System.out.println("too high ");
	       }
	       else
	       {
	           System.out.println("too low");
	       }
	   }
	   System.out.println("congulation u gueesed right number and your score is: "+count);
		
		sc.close();
    }
}
