import java.util.Scanner;
public class overloadingQue {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter side of square");
		//for square claA
		int side = sc.nextInt();
		System.out.println("area of square is "+claA(side));
		
		//for circle
		System.out.println("enter radius of circle");
		float radi = sc.nextFloat();
		System.out.println("area of square is "+claA(radi));
        sc.close();
	}
	public static int claA(int side) {
		int area = side * side;
		return area;
	}
	public static float claA(float radius) {
		float area = 3.14F*radius*radius;
		return area;
	}

}
