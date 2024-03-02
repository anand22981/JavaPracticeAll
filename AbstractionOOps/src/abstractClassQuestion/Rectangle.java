package abstractClassQuestion;

import java.util.Scanner;

public class Rectangle extends ShapeArea {
   int length;
   int breath;
   
   Scanner sc = new Scanner(System.in);
   void takeinput() {
	   System.out.println("enter a number");
		int a = sc.nextInt();
		length=a;
		
	}
	void calculate() {
		System.out.println("area"+length);
	}

}
