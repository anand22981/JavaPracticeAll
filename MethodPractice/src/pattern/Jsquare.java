package pattern;
import java.util.*;
public class Jsquare {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int a=sc.nextInt();
		//col for 1 to a|
		for(int i=1;i<=a;i++) {
			
			//row for __
			for(int j=1;j<=a;j++) {
				System.out.print(j);
			}
			//changing line to new line 
			System.out.println();
		}

	}

}
