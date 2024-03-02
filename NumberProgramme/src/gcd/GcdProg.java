package gcd;

public class GcdProg {
    public static void Gcd(int a , int b) {
    	int min=a;
    	if(a>b) {
    		min=b;
    	}
//    	else {
//    		min=a;
//    	}
    	int hcf=1;
    	for(int i=1;i<=min;i++) {
    		if(a%i==0 && b%i==0) {
    			hcf=i;
    			
    		}
    	}
    	System.out.println("gcd of a and b is: "+hcf);
    	
    	//or
//    	while(b!=0) {
//    		int rem=a%b;
//    		a=b;
//    		b=rem;
//    	}
//    	System.out.println(a);
  }
}
