package untilDigitSingle;

import java.util.Scanner;

public class UntilSingleApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int a=sc.nextInt();
		UntilSingle u1 = new UntilSingle();
		u1.Until(a);

	}

}
