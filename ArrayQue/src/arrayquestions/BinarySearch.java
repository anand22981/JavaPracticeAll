package arrayquestions;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
		int[] arr = new int[sc.nextInt()];
		System.out.println("enter "+arr.length+" element :");
		for(int i=0;i<=arr.length-1;i++) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter searching element :");
		int key=sc.nextInt();
		sc.close();
		SearchBinary search = new SearchBinary();
		search.Binary(arr,key);
		
		
	}

}
