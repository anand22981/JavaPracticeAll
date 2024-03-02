package abstractClassQuestion;

import java.util.Scanner;

public class Circle extends ShapeArea {
   int radius;
   Scanner sc = new Scanner(System.in);
   void takeinput() {
	   System.out.println("enter a number");
		int a = sc.nextInt();
		radius=a;
		
	}
	void calculate() {
		System.out.println("area"+radius);
	}
}
