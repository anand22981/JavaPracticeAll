package factorial;

public class FactorialNo {
  public static void Factor(int n) {
	  int ans =1;
	  for(int i=1;i<=n;i++) {
		  ans*=i;
	  }
	  System.out.println(ans);
  }
}
