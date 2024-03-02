package storingInArray;

import java.util.Scanner;

public class BacklogTrue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of semester : ");
		int sem = sc.nextInt();
		
		//boolean [] back = new boolean[sem];
//		for(int i=0;i<=back.length-1;i++) {
//			System.out.println("Do you have backlog in sem true and flase "+(i+1));
//			back[i]=sc.nextBoolean();
//		} 
		//or
		String [] back = new String[sem];
		for(int i=0;i<back.length;i++) {
			System.out.println("do u have back true or false :");
			boolean b=sc.nextBoolean();
			if(b) {
				back[i]="yes";
			}
			else {
				back[i]="no";
			}
		}
		sc.close();
		//display output
		for(int i=0;i<back.length;i++) {
			System.out.println("sem "+(i+1)+" having backlog "+back[i]);
		}

	}

}
