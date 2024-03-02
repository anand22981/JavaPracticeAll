package customException;
import java.util.Scanner;
public class DrivingLicince 
{
 void applyDl() throws Exception
 {
	 Scanner sc  = new Scanner(System.in);
	 System.out.println("enter your AGE");
	 int age = sc.nextInt();
	 if(age>=18 && age<=60) {
		 System.out.println("you succesfully apply for dl");
	 }
	 else 
	 {
		 DlException dl = new DlException();
		 throw dl;
	 }
 }
}
