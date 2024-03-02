package construct;
import java.util.Scanner;
public class Ifelse {

	public static void main(String[] args) {
		
			Scanner sc =  new Scanner(System.in);//making scanner object
				
			System.out.println("enter your age");//printing enter your marks
			//taking input as integer and storing in variable marks
			int age = sc.nextInt();
			if(age>18) {
				System.out.println("your can vote");
			}
			else {
				System.out.println("no you can't vote");
			}
			
		

	}

}
