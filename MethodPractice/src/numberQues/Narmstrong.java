package numberQues;
import java.util.*;
public class Narmstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arm a1 = new arm();
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			a1.Strong(i);
		}
		

	}

}
class arm{
	public static void Strong(int a) {
		//int a=1634;
		int rep=a;
		int c=0;
		while(a>0) {
			int n=a%10;
			a=a/10;
			c++;
		}
		
		int ans=0;
		a=rep;
		for(int i=1;i<=c;i++) {
			int x=rep%10;
			rep=rep/10;
			ans+=Math.pow(x,c);
		}
		if(ans==a) {
		System.out.println(ans);}
	}
}