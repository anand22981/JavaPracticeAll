package classObj;

public class NonStatic {

	public static void main(String[] args) {
		// calling  non static method in same class for more see note for different type calling
		int x=10;
		NonStatic nr=new NonStatic();
		nr.display(x);

	}
	public void display(int x) {
		System.out.println("i am integer "+x);
	}

}
