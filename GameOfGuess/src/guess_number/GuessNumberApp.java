package guess_number;
import java.util.*;
public class GuessNumberApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random re = new Random();
		int a=re.nextInt(100);
		GuessNumber g1 = new GuessNumber();
		g1.guess(a);
		sc.close();
	}

}
