package productOddNumb;

public class ProductOddNumber {
     public static void Product(int n) {
    	 int ans=1;
    	 for(int i=1;i<=n;i++) {
    		 ans*=2*i-1;
    		 
    	 }
    	 System.out.println(ans);
    	 
     }
}
