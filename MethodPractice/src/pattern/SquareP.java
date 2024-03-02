package pattern;
import java.util.*;
public class SquareP {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();
//		//using for loop print star square
//		for(int i =1;i<=a;i++) {  //outer loop col
//			for(int j=1;j<=a;j++) {   //innner loop for row
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
		
		//using while make a square star pattern
//		int i=1;
//		while(i<=a) {
//			int j=1;
//			while(j<=a) {
//				System.out.print("*");
//				j++;
//			}
//			i++;
//			System.out.println();
//		}
		
		//using do-while loop make patter of star 
		int i =1;
		do {
			int j=1;
			do {
				System.out.print("*");
				j++;
			}while(j<=a);
			i++;
			System.out.println();
		}while(i<=a);

	}

}
