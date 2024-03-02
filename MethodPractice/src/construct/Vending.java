package construct;
//Write a Java program that simulates a vending machine. The program 
//should take a product code as input 
//and output the product name. “P01” -> CocaCola “P02”->Pepsi “P03”->Magg
import java.util.Scanner;
public class Vending {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter product code");
		String a=sc.nextLine();
		Machine m1 = new Machine();
		m1.mach(a);
	}

}
