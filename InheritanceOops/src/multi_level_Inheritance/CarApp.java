package multi_level_Inheritance;

public class CarApp {

	public static void main(String[] args) {
		Sedan s1=new Sedan();
		s1.regno=1034;
		s1.move();
		
		System.out.println("-------------------------");
		Car c1=new Car();
		c1.regno=55555;
		c1.move();

	}

}
