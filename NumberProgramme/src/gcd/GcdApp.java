package gcd;

import java.util.Scanner;

public class GcdApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int a=sc.nextInt();
		System.out.println("enter a number : ");
		int b=sc.nextInt();
		GcdProg gp = new GcdProg();
		gp.Gcd(a, b);

	}

}
