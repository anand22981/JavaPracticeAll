package compareString;

public class StringCompare {

	public static void main(String[] args) {
		String s1 ="Java";//creating inside stringpool
		String s2 ="Java";//creating inside stringpool
		//== is used for checking reference are equal or not
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
		

	}

}
