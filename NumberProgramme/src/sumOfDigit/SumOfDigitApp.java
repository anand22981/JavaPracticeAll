package sumOfDigit;

import java.util.Scanner;

public class SumOfDigitApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int a=sc.nextInt();
		DigitSum d1= new DigitSum();
		d1.Sum(a);
	}

}
