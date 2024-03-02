//write a programme to take a integer as an input and if its above 90 print welcome to college

package construct;
import java.util.Scanner;
public class SimpleIf {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);//making scanner object
		
		System.out.println("enter your marks");//printing enter your marks
		//taking input as integer and storing in variable marks
		int marks = sc.nextInt();
		
		//checking marks>90 or not if true then execute
		if(marks>=90) {
			System.out.println("welocme to college");//printing welcome if true
		}

	}

}
