package construct;
import java.util.*; 
public class RecSQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter side 1");
		int a=sc.nextInt();
	    
	    System.out.println("enter side 2");
		int b=sc.nextInt();
		sqREc s1 = new sqREc();
		s1.check(a,b);

	}

}
class sqREc{
	public static void check(int a,int b) {
	if(a==b){
	    System.out.println("yes this rectangle is a square");
	}
	else{
	    System.out.println("no this is not ");
	}
}}