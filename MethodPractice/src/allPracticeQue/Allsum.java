package allPracticeQue;

public class Allsum {

	public static void main(String[] args) {
	 Sum n1 = new  Sum();
	 System.out.println("sum of all n number is: "+n1.nSum(5));

	}

}
class Sum{
	public static int nSum(int n) {
		int result=0;
		for(int i=1;i<=n;i++) {
			result+=i;
		}
		return result;
	}
}