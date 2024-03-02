package calculatorTryExceptionqUES;
import java.util.Scanner;
public class Calculator 
{
	Scanner sc = new Scanner(System.in);
 void add() throws Exception
 {
	 try {
	 System.out.println("enter a number");
	 int a = sc.nextInt();
	 System.out.println("enter second number");
	 int b = sc.nextInt();
	 int c = a+b;
	 System.out.println(c);
	 }
	 catch(Exception e) 
	 {
		 e.printStackTrace();
		 System.out.println("handle exception in add calc");
		 throw e;
	 }
 }
 
 void sub() throws Exception
 {
	 try {
	 System.out.println("enter a number");
	 int a = sc.nextInt();
	 System.out.println("enter second number");
	 int b = sc.nextInt();
	 int c = a-b;
	 System.out.println(c);
	 }
	 catch(Exception e) 
	 {
		 e.printStackTrace();
		 System.out.println("handle exception in sub calc");
		 throw e;
	 }
 }
 void mul() throws Exception
 {
	 try {
	 System.out.println("enter a number");
	 int a = sc.nextInt();
	 System.out.println("enter second number");
	 int b = sc.nextInt();
	 int c = a*b;
	 System.out.println(c);
	 }
	 catch(Exception e) 
	 {
		 e.printStackTrace();
		 System.out.println("handle exception in mul calc");
		 throw e;
	 }
 }
 void div() throws Exception
 {
	 try {
	 System.out.println("enter a number");
	 int a = sc.nextInt();
	 System.out.println("enter second number");
	 int b = sc.nextInt();
	 int c = a/b;
	 System.out.println(c);
	 }
	 catch(Exception e) 
	 {
		 e.printStackTrace();
		 System.out.println("handle exception in div calc");
		 throw e;
	 }
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
