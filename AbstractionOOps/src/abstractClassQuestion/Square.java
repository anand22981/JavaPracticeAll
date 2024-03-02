package abstractClassQuestion;
import java.util.Scanner;
public class Square extends ShapeArea{
	int side;
	Scanner sc = new Scanner(System.in);
	void takeinput() {
		System.out.println("enter a number");
		int a = sc.nextInt();
		side=a;
		
	}
	void calculate() {
		System.out.println("area"+side*side);
	}

}
