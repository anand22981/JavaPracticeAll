package fibonacci;

public class FibonacciNo {
 public static void Fib(int n)
 {
	 //0 1 1 2 3 5
	 int b=0;
	 int a=1;
	 System.out.println(b);
	 for(int i=1;i<n;i++) {
		 int ans=a+b;
		 a=b;
		 b=ans;
		 System.out.println(ans);
	 }
	 
 }
}
