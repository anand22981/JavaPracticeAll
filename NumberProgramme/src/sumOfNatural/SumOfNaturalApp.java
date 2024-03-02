package sumOfNatural;
import java.util.Scanner;
//Write a program to calculate the sum of first n natural numbers.
public class SumOfNaturalApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int a=sc.nextInt();
		SumOfNaturalNum s1 = new SumOfNaturalNum();
		System.out.println("sum of "+ a +" natural number is: ");
		s1.SumAll(a);

	}

}
