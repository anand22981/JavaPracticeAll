package sameLENGTHsTRING;

import java.util.Scanner;

public class SameLengthApp {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter string 1");
		String s=sc.nextLine();
		System.out.println("enter string 2");
		String s1=sc.nextLine();
		
		SameLength x =new SameLength();
		x.samelencheck(s1, s);
		
		sc.close();

	}

}
