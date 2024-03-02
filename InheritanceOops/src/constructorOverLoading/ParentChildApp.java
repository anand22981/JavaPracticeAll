package constructorOverLoading;

public class ParentChildApp {

	public static void main(String[] args) {
		Child c1= new Child();
		c1.display();
		System.out.println("+++++++++++++++++++++++");
		Child c2=new Child(70,80);
		c2.display();

	}

}
