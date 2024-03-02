package reThrowingException;
import java.util.Scanner;
public class Prog1 
{
 void disp1() throws Exception
 {
	 System.out.println("disp1 execution started.");
	 try {
		 Scanner sc = new Scanner(System.in); 
		 System.out.println("enter first number");
		 int a=sc.nextInt();
		 System.out.println("enter second number");
		 int b=sc.nextInt();
		 int c= a/b;
		 System.out.println(c);
		 sc.close();
		 
	 }
	 catch(Exception e) {
		 System.out.println("exception is handled in prog1");
		 throw e;
	 }
	 finally {
		 System.out.println("prog1 is ended");
	 }
 }
}
