package treeMaps;

import java.util.TreeMap;

public class ProgrammeTreeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm  = new TreeMap<Integer, String>();
		//TreeMap tm= new TreeMap();
		tm.put(11,"Mango");
		tm.put(12,"apple");
		tm.put(10, "kiwi");
		tm.put(9,"banana");
		System.out.println(tm);//{9=banana, 10=kiwi, 11=Mango, 12=apple}
		//adding hetrogeneous value
//		tm.put(10,10);//if we add existing key then our value is get modified
//		
//		System.out.println(tm);//{9=banana, 10=10, 11=Mango, 12=apple}
		
		

	}

}
