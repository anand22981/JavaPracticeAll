package methodInInheritance;

public class ParentChildApp {

	public static void main(String[] args) {
	Parent p1 = new Parent();
	Child c1 = new Child();
	p1.method1();//i am parent method1
	p1.method2();//i am parent method2
	
	c1.method1();//i am parent method1
	c1.method2();//i am overridden inherit method form class parent
	c1.method3();//i am specilized method only in child
	

	}

}
