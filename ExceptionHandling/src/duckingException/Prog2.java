package duckingException;
//ducking is the process where you give exception handling in calling method
public class Prog2 
{
 void disp2() 
 {
	 try {
		 
	 
	 System.out.println("program2 execution started");
	 Program1 p = new Program1();
	 p.display1();
	 System.out.println("prog2 get ended");
	 }
	 catch (Exception e) {
		 System.out.println("error handled succesfully");
	 }
	 System.out.println("Programme ends");
 }
}
