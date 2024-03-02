package factorial;
//Write a program to calculate the factorial of a given number.
import java.util.Scanner;

public class FactorialNoApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int a=sc.nextInt();
		FactorialNo f1 = new FactorialNo();
		f1.Factor(a);

	}

}
