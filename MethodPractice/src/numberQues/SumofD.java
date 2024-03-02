package numberQues;
import java.util.*;
public class SumofD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//takking input
		int a=sc.nextInt();
		//inslization var sum equal to 0
		int sum=0;
		//while a==0
		while(a>0) {
			sum+=a%10;
			a=a/10;
			//sum+=n;//adding last digit in sum
		}
		System.out.println(sum);//printing 

	}

}
