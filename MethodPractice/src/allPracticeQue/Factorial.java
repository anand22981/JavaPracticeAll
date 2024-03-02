package allPracticeQue;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter a numver: ");
		int a=sc.nextInt();
	     fact f1 = new fact();
	     
	     f1.fatorial(a);

	}

}
class fact{
	public static void fatorial(int n){
		int ans =1;
		for(int i=1;i<=n;i++) {
			ans*=i;
		}
		System.out.println(ans);
	}
}
