package multipleMethodUDEH;
import java.util.Scanner;
public class Prog1 {
void disp1() 
{
	Scanner sc = new Scanner(System.in);
	try {
		System.out.println(" disp1 execution started ....");
		System.out.println("enter number 1");
		int a =sc.nextInt();
		System.out.println("enter number 2");
		int b=sc.nextInt();
		sc.close();
		int c= a/b;
		System.out.println(c);
	}
	catch(Exception e) {
		System.out.println("exception handled");
	}
	System.out.println("disp1 execution ended");
}
}
