package construct;
import java.util.Scanner;
public class Prob1 {
//Write a Java program that prints "Positive Number" if the given number is greater than 0.
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter a number");//printing enter a number
		int num1=sc.nextInt();//taking input as integer and assigning in num1 variable
		
		Prob1Cla p1 = new Prob1Cla();//making object p1 of class Prob1Cla
		p1.Positive(num1);//passing argument 
		

	}

}
