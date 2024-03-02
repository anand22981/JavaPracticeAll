package storingInArray;

import java.util.Scanner;

public class DiagonalSum {

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
		int sum=0;
		int sum1=0;
		int x=arr.length-1;
		for(int i=0;i<=arr.length-1;i++) 
		{
			
			for(int j=0;j<=arr[i].length-1;j++) 
			{
				if(i==j) 
				{
					sum+=arr[i][j];
				}
				
				if(x==j) {
				sum1+=arr[i][j];
				x--;}
			}
			
		}
		
		System.out.println("sum of row  is "+sum);
		System.out.println("sum of row  is "+sum1);

	}

}
