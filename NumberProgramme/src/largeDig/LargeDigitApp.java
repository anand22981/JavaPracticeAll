package largeDig;

import java.util.Scanner;

public class LargeDigitApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int a=sc.nextInt();
		LargeDigit ld= new LargeDigit();
		ld.LrgeDigit(a);

	}

}
