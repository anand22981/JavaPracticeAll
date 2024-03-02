package palindromNo;

public class PalindromNum {
	public static void Palindrom(int a) {
		int z=a;
	    int r=0;
	    int s=0;
	    while(a>0) {
	    	r=a%10;
	    	a=a/10;
	    	s=(s*10)+r;
	    	
	    }
	    if(s==z) {
	    	System.out.println("palindrom");
	    }
	    else {
	    	System.out.println("not  a palindorm ");
	    }
	}

}
