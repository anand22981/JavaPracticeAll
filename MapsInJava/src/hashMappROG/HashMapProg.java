package hashMappROG;

import java.util.HashMap;
//output in ranodm order
public class HashMapProg {

	public static void main(String[] args) {
		HashMap hm = new HashMap();//creating hashmap object and store it in hm
		hm.put(11,"Mango");
		hm.put(12,"apple");
		hm.put(10, "kiwi");
		hm.put(9,"banana");
		System.out.println(hm);//{9=banana, 10=kiwi, 11=Mango, 12=apple}
		hm.put("Ashiu", 10);
		System.out.println(hm);//{9=banana, 10=kiwi, 11=Mango, Ashiu=10, 12=apple}
		hm.put(true,"hello");
		System.out.println(hm);//{9=banana, 10=kiwi, 11=Mango, Ashiu=10, 12=apple, true=hello}
		//if we put existing key and change value then our value get changed
		hm.put(10, "hm");
		System.out.println(hm);

	}

}
