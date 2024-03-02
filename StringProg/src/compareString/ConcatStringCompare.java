package compareString;

public class ConcatStringCompare {

	public static void main(String[] args) {
		String s1 ="Java";
		String s2 ="Java";
		
		String s3=s1+s2;//its not comes under stringpool  
		                 //cause we concatinate them now both get creater outside Stringpool
		String s4=s1+s2;
		if(s3==s4) {
			System.out.println("reference are equal");
		}
		else {
			System.out.println("reference are not equal");
		}
		//by using in-built method isquals 
		if(s3.equals(s4)) {
			System.out.println("Stirng are equal");
		}
		else {
			System.out.println("String are not equal");
		}

	}

}
