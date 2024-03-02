package allPracticeQue;

public class DigitSum {

	public static void main(String[] args) {
		int a=152;
		sumDigit s1 = new sumDigit();
		s1.digit(a);

	}

}
class sumDigit{
	public static void digit(int n) {
		int ans=0;
		for(int i=0;i<3;i++) {
			int a=n%10;
			n=n/10;
			ans+=a;
			//System.out.print(a);
		}
		System.out.print(ans);
	}
}