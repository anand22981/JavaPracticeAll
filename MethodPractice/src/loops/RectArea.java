package loops;
import java.util.*;
public class RectArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter lenght");
		int length=sc.nextInt();
		System.out.println("enter width");
		int width=sc.nextInt();
		System.out.println(clacRectArea(length,width));

	}
	public static double clacRectArea(int a , int b) {
		return a*b;
	}

}
