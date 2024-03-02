package storingInArray;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter size of array: ");
		int arr[]=new int[sc.nextInt()];

		System.out.println("enter array: ");
		for(int i=0;i<=arr.length-1;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("enter target you wat to search: ");
		int target=sc.nextInt();
		sc.close();

		boolean s = linearSearch(arr,target);

		if(s){
			System.out.println("target found in array ");
		}
		else{
			System.out.print("element not in array");
		}

	}

	public static boolean linearSearch(int arr[],int target){

		for(int i=0;i<=arr.length-1;i++){
			if(arr[i]==target){
				return true;
			}
		}
		return false;

	}



}

