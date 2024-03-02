package loops;
import java.util.Scanner;

public class MultipleTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no: ");
		int num = sc.nextInt();
		
		if(num>100) {
			MultipleTaskClass m1 = new MultipleTaskClass();
			m1.divTwo(num);
			System.out.println();
			m1.divThree(num);
			System.out.println();
			m1.divFive(num);
			
			System.out.println();
			m1.divTwoFive(num);
			
			System.out.println();
			m1.divThreeFive(num);
			
			System.out.println();
			m1.prime(num);
			
			System.out.println();
			m1.primeEven(num);
			
			System.out.println();
			m1.primeOdd(num);
			System.out.println();
			m1.evenDiv3(num);
			
			System.out.println();
			m1.oddDiv5(num);
		}
		else {
			System.out.println("enter number above 100 to perform task");
		}

	}

}
