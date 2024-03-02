package sortingOfComplexObject;

import java.util.ArrayList;
import java.util.Collections;

public class StudentApp {

	public static void main(String[] args) {
		Student s1 = new Student("Ashiu",28,90.9F);
		Student s2 = new Student("Cristo",23,70.9F);
		Student s3 = new Student("Martin",24,89.9F);
		
		ArrayList al=new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println(al);
		HelpingSorting hs = new HelpingSorting();
		Collections.sort(al,hs);
		System.out.println(al);

	}

}
