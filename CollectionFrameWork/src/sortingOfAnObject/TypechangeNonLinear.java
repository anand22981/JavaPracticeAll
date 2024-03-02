package sortingOfAnObject;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class TypechangeNonLinear {

	public static void main(String[] args) 
	{
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		ad.add(10);
		ad.add(20);
		ad.add(5);
		ad.add(14);
		System.out.println("element before"+ ad);
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.addAll(ad);
		Collections.sort(al);
		ad.clear();
		ad.addAll(al);
		System.out.println("element after"+ad);

	}

}
