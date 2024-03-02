package storingInArray;
import java.util.*;
public class ThreeintoThreeMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter size of row:");
		
		//System.out.println("enter size of column:");
		
		System.out.println("enter all element: ");
		int [][] arr= new int[3][3];
		
		for(int i=0;i<=arr.length-1;i++) 
		{
			for(int j=0;j<=arr[i].length-1;j++) 
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		sc.close();
		
		System.out.println("3*3 matrix is: ");
		for(int i=0;i<=arr.length-1;i++) 
		{
			for(int j=0;j<=arr[i].length-1;j++) 
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
			
		}
		

	}

}
