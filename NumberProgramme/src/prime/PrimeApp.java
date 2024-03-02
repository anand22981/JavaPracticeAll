package prime;

import java.util.Scanner;

public class PrimeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int a=sc.nextInt();
		PrimeNumber p1 = new PrimeNumber();
		p1.Isprime(a);

	}

}
