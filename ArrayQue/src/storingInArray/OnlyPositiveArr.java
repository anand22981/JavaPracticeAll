package storingInArray;
import java.util.*;
public class OnlyPositiveArr {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size of the array: ");
		int arr[] = new int[sc.nextInt()];
		
		System.out.println("enter the array: ");
		for(int i=0;i<=arr.length-1;i++){
		    arr[i]=sc.nextInt();
		}
		sc.close();
		
		System.out.println("+ve array are: ");
		for(int i:arr){
		    if(i>=0){
		    System.out.print((i)+" ");
		}
		    
		}
		
		}
	
	
	
	
	

}
