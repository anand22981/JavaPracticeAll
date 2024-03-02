package numberQues;
import java.util.*;
public class SumofSq {

	public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	System.out.println("enter a number: ");
	 int a=sc.nextInt();
	 int sum=0;
	 //loop from 1 to a
	 for(int i=1;i<=a;i++) {
		 sum+=i*i;
	 }
	 System.out.println(sum);
	}

}
