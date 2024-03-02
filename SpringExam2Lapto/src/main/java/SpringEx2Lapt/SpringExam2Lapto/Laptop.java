package SpringEx2Lapt.SpringExam2Lapto;

public class Laptop 
{

	int serialNo;
	String Brand;
	int price;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int serialNo, String brand, int price) {
		System.out.println("i am a constric");
		this.serialNo = serialNo;
		Brand = brand;
		this.price = price;
	}
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		
		this.serialNo = serialNo;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [serialNo=" + serialNo + ", Brand=" + Brand + ", price=" + price + "]";
	}
	
	
}
