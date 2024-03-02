package palindromNo;
import java.util.*;
public class PalindromNumberApp {

	public static void main(String[] args) {
		PalindromNum p1 = new PalindromNum();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int a=sc.nextInt();
		p1.Palindrom(a);

	}

}
