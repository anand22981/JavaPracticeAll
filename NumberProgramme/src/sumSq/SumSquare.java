package sumSq;

public class SumSquare {
    public static void Sum(int n ) {
    	int ans=0;
    	
    	for(int i=1;i<=n;i++) {
    		ans+=i*i;
    	}
    	System.out.println(ans);
    }
}
