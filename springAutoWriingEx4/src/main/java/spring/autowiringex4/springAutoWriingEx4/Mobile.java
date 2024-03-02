package spring.autowiringex4.springAutoWriingEx4;

public class Mobile 
{
   String brand;
   int ram;
   int cost;
public Mobile() {
	super();
	// TODO Auto-generated constructor stub
}
public Mobile(String brand, int ram, int cost) {
	super();
	this.brand = brand;
	this.ram = ram;
	this.cost = cost;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "Mobile [brand=" + brand + ", ram=" + ram + ", cost=" + cost + "]";
}
   
	
	
	
	
}
