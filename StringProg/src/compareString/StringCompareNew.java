package compareString;

public class StringCompareNew {

	public static void main(String[] args) {
		String s1 =new String("Java");//creating outside stringpool
		String s2 =new String("Java");//creating outside stringpool
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
		

	}

}
