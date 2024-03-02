package multipleCatchBlock;
import java.util.Scanner;
public class MultipleCatch {

	public static void main(String[] args) {
		System.out.println("Connection Established...");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number 1");
			int a =sc.nextInt();
			System.out.println("enter number 2");
			int b=sc.nextInt();
			int c= a/b;
			System.out.println(c);
			System.out.println("enter size of an array");
			int size = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("enter element");
			int elem = sc.nextInt();
			System.out.println("enter index where you want to store");
			int i  = sc.nextInt();
			arr[i]=elem;
			System.out.println("element stored succesfully");
			sc.close();
			
		}
		catch(ArithmeticException ae) {
			System.out.println("dont provide zero");
		}
		catch(NegativeArraySizeException ne) {
			System.out.println(" provide positive size");
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("dont provide zero");
		}
		catch(Exception e)  {
			System.out.println("Exception is handled");
		}
		System.out.println("connection terminated");
		

	}

}
