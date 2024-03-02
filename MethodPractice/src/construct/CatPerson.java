package construct;
//Write a Java program that categorizes people based on 
//their age: Child (0-12), Teen (13-19), Adult (20-59), Senior (60+).
import java.util.Scanner;
public class CatPerson {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter age");
		//taking input and storing in variable a 
		int a = sc.nextInt();
		Catper c1 = new Catper();
		c1.person(a);

	}

}
