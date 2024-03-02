package pattern;
import java.util.*;
public class SpaceSq {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter a numeber  :");
		int a = sc.nextInt();
		//to print rows
		for(int i=1;i<=a;i++) {
			//to print n spaces in every rows
			for(int j =1;j<=a;j++) {
				System.out.print(" ");
			}
			//to print n stars in every rows
			for(int k=1;k<=a;k++) {
				System.out.print("*");
			}
			//to send cursor next line
			System.out.println();
		}

	}

}
