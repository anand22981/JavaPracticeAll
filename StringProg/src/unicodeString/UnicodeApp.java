package unicodeString;

import java.util.Scanner;

public class UnicodeApp {

	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 String s=sc.nextLine();
	 Unicode u1=new Unicode();
	 u1.unicodeConvt(s);
     sc.close();
	}

}
