package sameLENGTHsTRING;

public class SameLength {
  public  void samelencheck(String s1,String s2) {
	  int n=s1.length();
	  int m=s2.length();
	  if(n==m) {
		  System.out.println("same length string");
	  }
	  else {
		  System.out.println("not same length String");
	  }
  }
}
