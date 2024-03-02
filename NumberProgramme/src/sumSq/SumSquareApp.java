package sumSq;

import java.util.Scanner;

public class SumSquareApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int a=sc.nextInt();
		SumSquare s1= new  SumSquare();
		s1.Sum(a);
	}

}
