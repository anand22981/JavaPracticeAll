package arrayquestions;

import java.util.Scanner;

public class InsertionSortApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
		int[] arr = new int[sc.nextInt()];
		System.out.println("enter "+arr.length+" element :");
		for(int i=0;i<=arr.length-1;i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		InsertionSort I1= new InsertionSort();
		I1.InsertSort(arr);
        sc.close();
	}

}
