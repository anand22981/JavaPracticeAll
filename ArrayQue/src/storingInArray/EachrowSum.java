package storingInArray;

import java.util.Scanner;

public class EachrowSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a size of row:");
		int a=sc.nextInt();
		System.out.println("enter a size of column:");
		int b=sc.nextInt();
		
		
		
		System.out.println("enter all element: ");
		int [][] arr= new int[a][b];
		
		for(int i=0;i<=arr.length-1;i++) 
		{
			for(int j=0;j<=arr[i].length-1;j++) 
			{
				arr[i][j]=sc.nextInt();
				
			}
		}
		sc.close();
		for(int i=0;i<=arr.length-1;i++) 
		{
			int sum=0;
			for(int j=0;j<=arr[i].length-1;j++) 
			{
				sum+=arr[i][j];
			}
			System.out.println("sum of row  is "+sum);
		}

	}

}
