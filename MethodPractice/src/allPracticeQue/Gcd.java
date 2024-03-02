package allPracticeQue;
import java.util.*;
public class Gcd {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter first number:");
		int a=sc.nextInt();
		System.out.println("enter second number:");
		int b=sc.nextInt();
        hcf h1 = new hcf();
        h1.hcfGcd(a, b);
	}

}
class hcf{
	public static void hcfGcd(int a , int b) {
		int min=a;
		if(a>b) {
			min=b;
		}
		else {
			min=a;
		}
		int hcf=1;
		for(int i =1 ;i<=min;i++) {
			if(b%i==0 && a%i==0) {
				hcf=i;
			}
		}
		System.out.println(hcf);
	}
}
