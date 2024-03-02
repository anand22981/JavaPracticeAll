package ploymorphismLoosecoupling;

public class VechicleApp {

	public static void main(String[] args) 
	{
		//tight coupling is noraml inheritance
		//eg:Bike bk = new Bike();
		//loose coupling 
		Vechicle ref;
		//we can write like this
		Bike bk = new Bike();
		ref = bk;
		ref.carry();//Bike can carry 2 Passanger
		ref.speed();//Bike is moving average
		Car cr = new Car();
		ref = cr;
		ref.carry();//car can carry 6 Passanger
		ref.speed();//car is moving fast
		//we can write also like this 
		ref  = new Bus();
		ref.carry();//bus can carry 12 Passanger
		ref.speed();//bus is moving slow
		

	}

}
