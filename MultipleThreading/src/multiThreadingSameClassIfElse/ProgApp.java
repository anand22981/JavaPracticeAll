package multiThreadingSameClassIfElse;

public class ProgApp {

	public static void main(String[] args) 
	{
		Prog t1 = new Prog();
		Prog t2 = new Prog();
		
		t1.setName("Add");
		t2.setName("Print");
		
		t1.start();
		t2.start();

	}

}
