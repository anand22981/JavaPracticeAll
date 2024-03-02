package creatingStack;
import java.util.*;
public class StackCreating {

	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
     System.out.println("enter stack size");
     int n=sc.nextInt();
     Stack sta=new Stack(n);
     while(true) {
    	 System.out.println("press 1 ------> Push");
    	 System.out.println("press 2 ------> Pop");
    	 System.out.println("press 3 ------> Display");
    	 System.out.println("Any other number --> stop");
    	 int choice=sc.nextInt();
    	 switch(choice) {
    	 case 1: sta.push();
    	 break;
    	 
    	 case 2: sta.pop();
    	 break;
    	 
    	 case 3: sta.display();
    	 break;
    	 
    	 default : System.exit(0);;
   
    	 }
     }
	}

}
