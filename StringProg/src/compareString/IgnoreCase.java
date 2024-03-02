package compareString;

public class IgnoreCase {

	public static void main(String[] args) {
		String s1 ="Java";//creating inside stringpool
		//String s2 =new String("JavA");//creating outside stringpool
		String s2 =new String("Java");
		//compare string address 
		if(s1==s2) {
			System.out.println("reference are equal");
		}
		else {
			System.out.println("reference are not equal");
		}
		//by using in built method isquals we can check string
		if(s1.equals(s2)) {
			System.out.println("Stirng are equal");
		}
		else {
			System.out.println("String are not equal");
		}
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("String are equals after ignore case");
		}
		else {
			System.out.println("String are not equals after ignoring case");
		}
		

	}

}
