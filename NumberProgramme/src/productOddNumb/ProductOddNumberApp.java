package productOddNumb;
import java.util.*;
public class ProductOddNumberApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int a=sc.nextInt();
		ProductOddNumber od1 = new ProductOddNumber();
		od1.Product(a);

	}

}
