package simpleInheritance;

public class ParentChildApp {

	public static void main(String[] args) {
		Child c1 = new Child();
		System.out.println(c1.name);
		c1.hobby();
		c1.name="ashiu";
		
		c1.hobby();

	}

}
