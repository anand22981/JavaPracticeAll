package evenNumber;
import java.util.*;
public class EvenNumberApp {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter a number : ");
		int a=sc.nextInt();
		EvenNumber e1 = new EvenNumber();
		System.out.println("Even number are :");
		for(int i=1;i<=a;i++) {
			e1.EvenToN(i);
		}
		
		
	}

}
