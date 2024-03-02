package allPracticeQue;
import java.util.*;
public class Fibonachi {

	public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	System.out.println("enter a numver: ");
	int a=sc.nextInt();
     fib f1 = new fib();
     
     f1.fibo(a);
	}

}
class fib{
	public static void fibo(int n){
		int x=0;
		int y=1;
		System.out.println(x);
		for(int i=1;i<n;i++) {
			int z=x+y;
			y=x;
			x=z;
			System.out.println(z);
		}
}}