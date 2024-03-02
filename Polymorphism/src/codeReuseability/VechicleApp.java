package codeReuseability;

public class VechicleApp {
public static void main(String[] args) 
{
	Bike bk=new Bike();
	Car ce = new Car();
	Bus b=new Bus();
	
	Transport t = new Transport();
	t.activity(bk);
	t.activity(ce);
	t.activity(b);
	
}
}
