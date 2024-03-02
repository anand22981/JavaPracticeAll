
public class Program {

	public static void main(String[] args) {
		int x=10;//local variable
		//for static method
		display();
		// for non- static method
		Program pr = new Program();
		pr.displays(x);

	}
	// for static you can call directly 
	public static void display() {
		System.out.println("I am inside the display");
		//sysout ctrl+space for sopln
	}
	// for non- static you can't use direct you have to create object
	public void displays(int n) {
		System.out.println("hello i am non static "+n);
	}

}
