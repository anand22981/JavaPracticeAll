package linkedList;
import java.util.*;
public class InBuildMethodInLiNKEDlIST {

	public static void main(String[] args)
	{
		LinkedList a = new LinkedList();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add("Rohit");
		a.add(98.4F);
		a.add(true);
		System.out.println(a);//[100, 200, 300, Rohit, 98.4, true]
		System.out.println(a.contains(100));
		a.add(1,10);
		System.out.println(a);
		LinkedList b = new LinkedList();
		b.add(80);
		b.add(90);
		b.add(60);
		System.out.println(b);
		
		LinkedList c = new LinkedList();
		c.addAll(a);
		System.out.println(c);//[100, 10, 200, 300, Rohit, 98.4, true]
		
		c.addAll(2, b);
        System.out.println(c);//[100, 10, 80, 90, 60, 200, 300, Rohit, 98.4, true]
		
        c.addFirst(1);
        //part of deque
        c.offer(1234);//add in last but part of deque
        System.out.println(c);//[1, 100, 10, 80, 90, 60, 200, 300, Rohit, 98.4, true, 1234]
        c.offerFirst(001);
		
        System.out.println(c);
        
        //peek
        System.out.println(c.peek());//print first wlwmwnr
        System.out.println(c);//output remain same
        //poll
        System.out.println(c.poll());//1 pick frist element and delete it
        System.out.println(c);//[1, 100, 10, 80, 90, 60, 200, 300, Rohit, 98
        
		
		
		
		
		
		
		
		
		

	}

}
