package storingInArray;
import java.util.Scanner;
public class TwoDarr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row:");
	    int a=sc.nextInt();
	     System.out.println("enter col:");
	     int b=sc.nextInt();
	     int arr[][]= new int[a][b];
	     
	     for(int i=0;i<=arr.length-1;i++) {
	    	 for(int j=0;j<=arr[i].length-1;j++) {
	    		 System.out.println("enter no of student: ");
	    		 arr[i][j]=sc.nextInt();
	    	 }
	     }

	     sc.close();
	     for(int i=0;i<=arr.length-1;i++) {
	    	 for(int j=0;j<=arr[i].length-1;j++) {
	    		 System.out.print(arr[i][j]+" ");
	    	 }
	     }
	}

}
