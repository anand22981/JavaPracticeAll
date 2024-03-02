package poductConsumerProblem;

public class PizzaHouseApp {

	public static void main(String[] args) {
		PizzaHouse  ph =  new PizzaHouse ();
		Baker b = new Baker(ph);
		Eater e = new Eater(ph);
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(e);
		
		t1.start();
		t2.start();

	}

}
