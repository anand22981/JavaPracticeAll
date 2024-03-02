package storingInArray;
import java.util.*;
public class ReverseStringInArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array:");
		String[] arr=new String[sc.nextInt()];
		System.out.println("enter string "+arr.length+" time ");
		
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.next();
		}
		String[] arr1 = new String[arr.length];
		int k=0;
		for(String i: arr){
		    String r="";
		    for(int j =i.length()-1;j>=0;j--){
		        char c = i.charAt(j);
		        r+=c;
		    }
		    arr1[k]=r;
		    k++;
		}
		System.out.println("your reversed string are: ");
	 	for(String s:arr1){
	 	    System.out.print(s+" ");
		}

	}

}
