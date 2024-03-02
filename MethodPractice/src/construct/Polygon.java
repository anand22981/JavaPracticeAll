package construct;
import java.util.Scanner;
public class Polygon {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter sides");
		//taking input and storing in variable a 
		int a = sc.nextInt();
		Polycla c1 = new Polycla();
		c1.poly(a);

	}

}
