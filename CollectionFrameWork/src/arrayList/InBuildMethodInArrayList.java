package arrayList;

import java.util.ArrayList;
public class InBuildMethodInArrayList {

	public static void main(String[] args) 
	{
		
		//ArrayList<Integer> al = new ArrayList<Integer>();//genric
		ArrayList a = new ArrayList();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add("Rohit");
		a.add(98.4F);
		a.add(true);
		System.out.println(a);//[100, 200, 300, Rohit, 98.4, true]
		System.out.println(a.contains(100));
		
		ArrayList b = new ArrayList();
		b.add(80);
		b.add(90);
		b.add(100);
		b.add("Mohit");
		System.out.println(a.containsAll(b));//false
		System.out.println(a.get(3));//Rohit
		System.out.println(a.indexOf(300));//2
		System.out.println(a.isEmpty());//false
		b.clear();
		System.out.println(b.isEmpty());//true
		a.remove(3);//3 is the index
		System.out.println(a);//[100, 200, 300, 98.4, true]
		System.out.println(a.size());//5
		
		a.set(2,10);//index 2 set 10
		System.out.println(a);//[100, 200, 10, 98.4, true]
		
		
	}

}
