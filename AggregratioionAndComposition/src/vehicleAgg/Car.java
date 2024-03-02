package vehicleAgg;

public class Car extends Vehicle {
	Engine e = new Engine(111);
	void hasA(Key ref) {
		System.out.println(ref.getColor()+"key color");
	}
	void engNo() {
		System.out.println(e.getEngine()+" engine number");
	}
	void start() {
		System.out.println(brand+" car is start");
	}

}
