package storingInArray;
import java.util.Scanner;
public class SwapArrByIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter size of array: ");
		int arr[]=new int[sc.nextInt()];
		
		System.out.print("enter array: ");
		for(int i=0;i<=arr.length-1;i++){
		    arr[i]=sc.nextInt();
		}
		
		
		System.out.println("enter first swaping index:");
		int a=sc.nextInt();
		System.out.println("enter second swaping index:");
		int b=sc.nextInt();
		sc.close();
		
		int help;
		help=arr[a];
		arr[a]=arr[b];
		arr[b]=help;
		
		
		for(int i:arr){
		    System.out.print(i+" ");
		}
		}

}
