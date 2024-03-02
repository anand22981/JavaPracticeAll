package pattern;
import java.util.*;
import java.util.Scanner;

public class HollowPrimid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=a;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				if(k==1) {
				System.out.print("*");}
				else {
					System.out.print(" ");
				}
			}
			for(int k=1;k<i;k++) {
				//System.out.print(i);
				if(k+1==i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		//for down side 
		for(int i=2;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=a;k>=i;k--) {
				if(k==a) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int k=a;k>i;k--) {
				if(k-1==i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		

	}

	}


