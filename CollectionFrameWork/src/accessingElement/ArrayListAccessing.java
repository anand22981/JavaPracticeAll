package accessingElement;
import java.util.*;
public class ArrayListAccessing {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		for(int i=0;i<=al.size()-1;i++) {
			System.out.print(al.get(i)+" ");
		}
		

	}

}
