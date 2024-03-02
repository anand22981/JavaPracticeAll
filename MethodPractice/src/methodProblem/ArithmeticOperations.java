package methodProblem;

public class ArithmeticOperations {

	public static void main(String[] args) {
		System.out.println(mul(4,5));
		System.out.println(add(4,5));
		System.out.println(sub(20,5));
		System.out.println(rem(10,3));
		

	}
	public static int mul(int x,int y) {
		return x*y;
	}
	public static int add(int x,int y) {
		return x+y;
	}
	public static int sub(int x,int y) {
		return x-y;
	}
	public static int rem(int x,int y) {
		return x%y;
	}

}
