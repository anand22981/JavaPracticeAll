package fibonacci;
//Write a program to print the Fibonacci series up to n terms.
import java.util.*;
public class FibonacciApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int a=sc.nextInt();
		FibonacciNo f1 = new FibonacciNo();
		f1.Fib(a);

	}

}
