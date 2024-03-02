package largeDig;

public class LargeDigit {
    public static void LrgeDigit(int a) {
    	int ans=0;
		while(a>0) {
			int n=a%10;
			a=a/10;
			if(ans<n) {
				ans=n;
			}
		}System.out.println(ans);
    }
}
