package storingInArray;
import java.util.Scanner;
public class ReverseArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array: ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("enter the array: ");
		for(int i=0;i<=arr.length-1;i++){
		    arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("normal array: ");
		for(int i:arr){
		    System.out.print(i+" ");
		}
		System.out.println();
		Reverse(arr);
		//for sum
		System.out.println();
		Add(arr);
		
		}
		
		public static void Reverse(int arr[])
		{
			System.out.println("reverse array:");
		    for(int i=arr.length-1;i>=0;i--){
		        System.out.print(arr[i]+" ");
		    }
		    
		}
		
		public static void Add(int arr[])
		{
		    int a=0;
		    for(int i:arr){
		        a+=i;
		    }
		    System.out.println("sum :"+ a);
		    
		}
	
	
	
	
}
