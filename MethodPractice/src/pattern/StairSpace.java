package pattern;
import java.util.*;
public class StairSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  a number : ");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j =a;j>=i;j--) {
				System.out.print("*");
			}
			for(int k=a;k>=i;k--) {
				System.out.print("-");
			}
			System.out.println();
		}

	}

}
