package loops;
import java.util.*;
public class Table {

	public static void main(String[] args) {
		tabl t1 = new tabl();
		t1.tab(2);
		t1.tab(3);
    
	}

}
class tabl{
	public static void tab(int a) {
		for(int i=1;i<=10;i++) {
			System.out.println(i*a);
		}
	}
}