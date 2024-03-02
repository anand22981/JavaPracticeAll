package numberQues;
import java.util.*;
public class Alleven1ton {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int a=sc.nextInt();
		Eventon e1 = new Eventon();
		for(int i=1;i<=a;i++) {
			e1.even(i);
		}

	}

}

class Eventon{
	public static void even(int n) {
		if(n%2==0) {
			System.out.println(n);
		}
	}
}
