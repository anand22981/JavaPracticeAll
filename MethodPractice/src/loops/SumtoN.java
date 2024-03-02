package loops;

public class SumtoN {

	public static void main(String[] args) {
		sum s1 = new sum();
		s1.allsum(5);

	}

}
class sum{
	public static void allsum(int n) {
		int ans=0;
		for(int i=1;i<=n;i++) {
			ans+=i;
		}
		System.out.println(ans);
	}
}