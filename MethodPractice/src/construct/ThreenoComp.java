package construct;
import java.util.*;
public class ThreenoComp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1");
		int a=sc.nextInt();
	    
	    System.out.println("enter number 2");
		int b=sc.nextInt();
	    
	    System.out.println("enter number 3");
		int c=sc.nextInt();
		comp c1 = new comp();
		c1.gret(a, b, c);

	}

}
class comp{
	public static void gret(int a,int b,int c) {
		if(a==b&&b==c){
		    System.out.println("all three are equal");
		}
		else if(a>b && a>c){
		    System.out.println(a+" is greater");
		    
		}
		else if(a<b && b>c){
		    System.out.println(b+" is greater");
		    
		}
		else{
		    System.out.println(c+" is greater");
		}
	}
}