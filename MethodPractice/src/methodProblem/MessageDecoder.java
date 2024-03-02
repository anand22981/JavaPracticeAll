package methodProblem;
import java.util.*;
public class MessageDecoder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		messgae code =  new messgae();
		System.out.println(code.decode(a));
		

	}

}
class messgae{
	public static int decode(char ch) {
		int ans=ch;
		return ans;
		
	}
}
