package loops;

public class FactDo {

	public static void main(String[] args) {
		int a =6;
		int i=1;
		do {
			i=a*i;
			a--;
		}while(a>=1);
		System.out.println(i);

	}

}
