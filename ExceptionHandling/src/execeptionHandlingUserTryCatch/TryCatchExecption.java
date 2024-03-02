package execeptionHandlingUserTryCatch;
import java.util.Scanner;
public class TryCatchExecption {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//handling zero exception
		try {
			System.out.println("execution started ....");
			System.out.println("enter number 1");
			int a =sc.nextInt();
			System.out.println("enter number 2");
			int b=sc.nextInt();
			sc.close();
			int c= a/b;
			System.out.println(c);
			
		}
		catch(Exception e) {
			System.out.println("Exception handled sucessfully"+e);
		}
		System.out.println("programme ended:}");

	}

}
