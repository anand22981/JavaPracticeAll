package hashSet;
import java.util.*;
public class HashSetfRAME {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(10);
		h.add(20);
		h.add(50);
		h.add(100);
		h.add(50);
		h.add("he");
		
		System.out.println(h);//[50, 20, 100, 10]
        
	}

}
