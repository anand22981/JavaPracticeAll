package pattern;
import java.util.*;
public class DecSquareP {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int a=sc.nextInt();
		int c=a*a+1;
		//for col 1 to a
		for(int i=1;i<=a;i++) {
			//row 1 to a 
			for(int j=1;j<=a;j++) {
				//decrement c for integera*a-1,.... 1 2 3 4 5 6 ;
				c--;
				System.out.print(c+" ");
			}
			//new line or line break
			System.out.println();
		}

	}

}
