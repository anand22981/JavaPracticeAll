package storingInArray;
import java.util.*;
public class StringToArray {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a word:");
		String s=sc.next();
		String arr[]=new String[s.length()];
		for(int i=0;i<=s.length()-1;i++){
		    char c=s.charAt(i);
		    arr[i]=String.valueOf(c);
		}
		
		System.out.println("array is:");
		for(String i:arr){
		    System.out.print(i+" ");
		}

	}

}
