package pattern;
import java.util.*;
public class Piramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=a;j>=i;j--) {// row -----
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {//col*
				System.out.print("*");
			}
			for(int k=1;k<i;k++) {
				System.out.print("*");
			}System.out.println();
		}

	}

}
