package vehicleAgg;

public class VehicleApp {

	public static void main(String[] args) {
		Car m=new Car();
		m.brand="tata";
		m.start(); 
		
		Key k = new Key("silver");
		m.hasA(k);
		
		m.engNo();
		

	}

}
