package linkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMAP {

	public static void main(String[] args) {
		LinkedHashMap lmh = new LinkedHashMap();
		lmh.put(11, "apple");
		lmh.put(10,124312);
		lmh.put("A",true);
		lmh.put(13,124312);
		System.out.println(lmh);//{11=apple, 10=124312, A=true, 13=124312}
		

	}

}
