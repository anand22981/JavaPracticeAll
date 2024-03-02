package sortingOfComplexObject;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee e1 = new Employee(4,"ashiu",40000);
		Employee e2 = new Employee(2,"cristo",40000);
		Employee e3 = new Employee(9,"martin",40000);
		
		ArrayList al = new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		

	}

}
