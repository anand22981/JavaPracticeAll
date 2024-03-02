package storingInArray;
import java.util.*;
public class CopyArr {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter size of array: ");
	int arr[]=new int[sc.nextInt()];
	
	for(int i=0;i<=arr.length-1;i++){
	    arr[i]=sc.nextInt();
	}
	sc.close();
	int arr2[]=new int[arr.length];
	
	for(int i=0;i<=arr.length-1;i++){
	    arr2[i]=arr[i];
	}
	
	System.out.println("array of 1: ");
	for(int i:arr){
	    System.out.print(i+" ");
	}
	
	System.out.println();
	
	System.out.println("array of 2: ");
	for(int i:arr2){
	    System.out.print(i+" ");
	}
	}	
}
