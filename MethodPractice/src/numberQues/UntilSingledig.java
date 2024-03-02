package numberQues;
import java.util.*;
public class UntilSingledig {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int sum=0;
		while(a>0||sum>9){
		    if(a==0){
		        a=sum;
		        sum=0;
		    }
		    sum+=a%10;
		    a/=10;
		    
		   
		}
		System.out.print(sum);

	}

}
