package practicesetStrings;
import java.util.Scanner;
public class LengthStringCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string:");
		String s=sc.nextLine();
		System.out.println("enter second string:");
		String s1=sc.nextLine();
		sc.close();
        if(s.length()==s1.length()) {
        	System.out.println("both are equal");
        }
        else {
        	System.out.println("both are not equal");
        }
	}

}
