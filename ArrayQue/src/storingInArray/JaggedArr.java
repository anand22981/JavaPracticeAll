package storingInArray;
import java.util.*;
public class JaggedArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter no. of class :");
	    int row=sc.nextInt();
	    int [][] arr = new int[row][];
	    
	for(int i=0;i<=arr.length-1;i++){
	    System.out.println("enter no. of student of  class"+(i+1));
	    int col=sc.nextInt();
	    arr[i]=new int[col];
	}
	
	for(int i=0;i<=arr.length-1;i++){
	    for(int j=0;j<=arr[i].length-1;j++){
	        System.out.println("enter % of class "+(i+1)+" of student "+(j+1));
	        arr[i][j]=sc.nextInt();
	        
	    }
	}
	sc.close();
	
	
	for(int i=0;i<=arr.length-1;i++){
	    for(int j=0;j<=arr[i].length-1;j++){
	        System.out.println(" % of class "+(i+1)+" of student "+(j+1)+" is "+ arr[i][j]);
	       
	        
	    }
	}
		
		

	}

}
