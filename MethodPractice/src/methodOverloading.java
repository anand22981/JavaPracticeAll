//import java.util.Scanner;
public class methodOverloading {

	public static void main(String[] args) {
		
		getMaggie();//for this get maggie having no parameter run only
		getMaggie(2);//for this get maggie having one int parameter run
		getMaggie("choclate");
		getMaggie("strawbeery",2);
		
		
		

	}
	public static void getMaggie() {
		System.out.println("bill of maggiee is 30");
	}
	public static void getMaggie(int qu) {
		System.out.println("billing of "+qu+"maggiee is "+(qu*30));
	}
	public static void getMaggie(String ty) {
		System.out.println("billing of maggie of "+ty+"is"+50);
	}
	public static  void getMaggie(String ty,int qu) {
		System.out.println("billing of "+ty+"maggie is "+(qu*50));
	}

}
