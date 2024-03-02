package numberQues;
import java.util.*;
public class LargestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int ans=0;
		while(a>0) {
			int n=a%10;
			a=a/10;
			if(ans<n) {
				ans=n;
			}
		}System.out.println(ans);

	}

}
