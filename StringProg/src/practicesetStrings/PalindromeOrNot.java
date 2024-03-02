package practicesetStrings;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string:");
		String s=sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			char c = s.charAt(i);
			rev+=c;
		}
		if(rev.equals(s)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindromema");
		}

	}

}
