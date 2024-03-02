package storingInArray;
import java.util.*;
public class NoOfBack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of sem:");
		int sem = sc.nextInt();
		
		int [] bl = new int[sem];
		
		for(int i=0;i<=bl.length-1;i++) {
			System.out.println("do u have backlog:");
			boolean a=sc.nextBoolean();
			if(a) {
				System.out.println("how many backlog do u have in sem:"+(i+1));
				bl[i]=sc.nextInt();
			}
			else {
				bl[i]=0;
			}
		}
		sc.close();
		//inhanced for loop for printing the array
//		for(int i:bl) {
//			System.out.println(i);
//		}
		//traditional for loop
        for(int i=0;i<bl.length;i++) {
        	System.out.println("sem "+(i+1)+"having back of "+bl[i]);
        }
	}

}
