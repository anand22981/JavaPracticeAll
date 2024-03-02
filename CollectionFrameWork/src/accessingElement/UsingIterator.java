package accessingElement;

import java.util.*;

public class UsingIterator {

	public static void main(String[] args) {
		LinkedList<Integer> al = new LinkedList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
