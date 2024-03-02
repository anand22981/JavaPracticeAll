package creatingString;

public class CreateStringtype {

	public static void main(String[] args) {
		//immuatable string
		//type 1
		//creating String using new keyword
		String s1=new String("JAVA");
		
		//type 2
		//creating string using without new keyword
		String s2="Java";
		
		//type 3
		//creating String using char array
		char[] ch= {'J','a','v','a'};
		String s3=new String(ch);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
