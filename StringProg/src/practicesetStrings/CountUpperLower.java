package practicesetStrings;

import java.util.Scanner;

public class CountUpperLower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string:");
		String s=sc.nextLine();
        int low=0;
        int upper=0;
        for(int i=0;i<=s.length()-1;i++) {
        	char c =s.charAt(i);
        	if(Character.isLowerCase(c)) {
        		low++;
        	}
        	else {
        		upper++;
        	}
        }
        System.out.println("lower case count: "+low);
        System.out.println("lower case count: "+upper);

	}

}
