package methodhidingPoly;

public class ParentApp {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.display(); //---->parent.display
		
		Child c1= new Child();
		c1.display(); //---> child.display
		
		Parent p2 = new Child();
		p2.display(); //----> Parent.display
		

	}

}
