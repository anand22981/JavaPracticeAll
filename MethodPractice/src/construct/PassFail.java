package construct;
import java.util.Scanner;
public class PassFail {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int marks=sc.nextInt();//storing input of user from keyboard in marks
		PF p1 = new PF();//creating object of clss Pf
		p1.result(marks);//envoking method on name result and givng a parameter

	}

}
class PF{
	public static void result(int marks) {
		//chcecking marks is above 50 or not
		if(marks>50) {
			System.out.println("pass");
		}
		else {
			System.out.println("oop!!!! you are fail");
		}
	}
}
