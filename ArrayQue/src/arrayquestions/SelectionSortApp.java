package arrayquestions;

import java.util.Scanner;

public class SelectionSortApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
		int[] arr = new int[sc.nextInt()];
		System.out.println("enter "+arr.length+" element :");
		for(int i=0;i<=arr.length-1;i++) 
		{
			arr[i]=sc.nextInt();
		}
		SelectionSort s1= new SelectionSort();
		s1.SelectSort(arr);
		sc.close();
}}
