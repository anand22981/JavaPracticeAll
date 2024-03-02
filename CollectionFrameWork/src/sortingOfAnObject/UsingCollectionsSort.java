package sortingOfAnObject;

import java.util.ArrayList;
import java.util.Collections;

public class UsingCollectionsSort {

	public static void main(String[] args) 
	{
		ArrayList<Integer> ts = new ArrayList<Integer>();
		ts.add(10);
		ts.add(20);
		ts.add(5);
		ts.add(14);
		System.out.println("before sorting "+ts);
		Collections.sort(ts);
		System.out.println("after sorting "+ts);
		

	}

}
