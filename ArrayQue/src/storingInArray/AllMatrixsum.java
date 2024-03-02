package storingInArray;
import java.util.*;
public class AllMatrixsum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a size of row:");
		int a=sc.nextInt();
		System.out.println("enter a size of column:");
		int b=sc.nextInt();
		
		int sum=0;
		
		System.out.println("enter all element: ");
		int [][] arr= new int[a][b];
		
		for(int i=0;i<=arr.length-1;i++) 
		{
			for(int j=0;j<=arr[i].length-1;j++) 
			{
				arr[i][j]=sc.nextInt();
				sum+=arr[i][j];
			}
		}
		sc.close();
		System.out.println("sum of all matrix is :"+sum);
		
		
		
		

	}

}
