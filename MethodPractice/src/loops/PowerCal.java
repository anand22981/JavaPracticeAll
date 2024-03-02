package loops;
//Sample Input 1: 2, 3 Sample Output 1: 8 Sample Input 2: 5, 4 Sample Output 2: 625
public class PowerCal {

	public static void main(String[] args) {
		power p1 = new power();
		p1.cal(5,4);

	}

}
class power{
	public static void cal(int a,int b) {
		int ans=1;
		for(int i=1;i<=b;i++) {
			ans=ans*a;
			
		}
		System.out.println(ans);
	}
}
