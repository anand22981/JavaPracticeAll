package creatingQueue;

import java.util.Scanner;

import creatingStack.Stack;

public class QueueCreation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("enter queue size");
	     int n=sc.nextInt();
	     QueueCode queu=new QueueCode(n);
	     while(true) {
	    	 System.out.println("press 1 ------> Push");
	    	 System.out.println("press 2 ------> Pop");
	    	 System.out.println("press 3 ------> Display");
	    	 System.out.println("Any other number --> stop");
	    	 int choice=sc.nextInt();
	    	 switch(choice) {
	    	 case 1: queu.insert();
	    	 break;
	    	 
	    	 case 2: queu.delete();
	    	 break;
	    	 
	    	 case 3: queu.disply();
	    	 break;
	    	 
	    	 default : System.exit(0);;
	   
	    	 }
	     }

	}

}
