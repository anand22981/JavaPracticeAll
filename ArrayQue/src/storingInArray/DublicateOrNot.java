package storingInArray;
import java.util.Scanner;
public class DublicateOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array: ");
		int [] arr = new int[sc.nextInt()];
		System.out.println("enter array : ");
        for(int i=0;i<=arr.length-1;i++) 
        {
        	arr[i]=sc.nextInt();
        }
        sc.close();
        
        for(int i=0;i<=arr.length-1;i++){
    	    for(int j=i+1;j<=arr.length-1;j++){
    	        if(arr[i]==arr[j]){
    	            System.out.println("dublicate present remove "+arr[i]);
    	            return;
    	        }
    	    }
    	   
    	}
    	System.out.println("no dublicate");
        
        
        
	}

}
