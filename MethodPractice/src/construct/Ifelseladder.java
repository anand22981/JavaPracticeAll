package construct;
import java.util.Scanner;
public class Ifelseladder {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);//making scanner object
		
		System.out.println("enter your number");//printing enter your marks
		//taking input as integer and storing in variable marks
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("+ve");
		}
		else if(num<0) {
			System.out.println("-ve");
		}
		else {
			System.out.println("number is zero");
		}

	}

}
