package pattern;
import java.util.*;
import java.util.Scanner;

public class DiamondP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=a;j>=i;j--) {
				System.out.print("-");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			for(int k=1;k<i;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		//for down side 
		for(int i=2;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("-");
			}
			for(int k=a;k>=i;k--) {
				System.out.print("*");
			}
			for(int k=a;k>i;k--) {
				System.out.print("*");
			}System.out.println();
		}
		
		

	}

	}


