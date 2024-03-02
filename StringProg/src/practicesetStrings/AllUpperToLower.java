package practicesetStrings;

import java.util.Scanner;

public class AllUpperToLower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string:");
		String s=sc.nextLine();
		String change="";
		for(int i=0;i<=s.length()-1;i++) {
			char c = s.charAt(i);
			if(Character.isLowerCase(c)) {
				change+=Character.toUpperCase(c);
			}
			else {
				change+=Character.toLowerCase(c);
			}
		}
        System.out.println(change);
	}

}
