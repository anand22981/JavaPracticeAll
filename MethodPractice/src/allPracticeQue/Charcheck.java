package allPracticeQue;
import java.util.Scanner;
//Write a Java program that accepts a character and identifies if 
//it's a lower-case vowel, upper-case vowel, 
//lower-case consonant, upper-case consonant, digit, or special character.

public class Charcheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character ");
		char ch  = sc.next().charAt(0);
        Charchecker c1 = new Charchecker();
        c1.Check(ch);
	}

}
