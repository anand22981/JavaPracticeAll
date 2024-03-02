package inbuildStringMethod;

public class InbuildStringclass {

	public static void main(String[] args) {
		String s1="Ashiu Aristo";
		
		//convert into upper
		System.out.println(s1.toUpperCase());//ASHIU
		
		//for convert into  lower 
		System.out.println(s1.toLowerCase());//ashiu
		
		//for character at some index 
		System.out.println(s1.charAt(3));
		
		//for index find out of a character
		System.out.println(s1.indexOf("s"));
		System.out.println(s1.indexOf("s",3));
		
		System.out.println(s1.contains("Cristo"));
		
		
		System.out.println(s1.substring(1,4));
		//for length of a given String
		System.out.println(s1.length());
		
		System.out.println(s1.startsWith("A"));
		System.out.println(s1.endsWith("u"));
		
		//System.out.println(s1.toCharArray());
		char ch[] = s1.toCharArray();
		for(char i :ch) {
			System.out.print(i+" ");
		}
		System.out.println();
		String re = s1.replace('A','s');
		System.out.println(re);
		
		System.out.println(s1.trim());//only used to remove start and end space
		
		//string to array string using split
		String s2="1 2 3 4 5";
		String[] arrS=s2.split(" ");
		for(String i:arrS) {
			System.out.print(i+" ");
		}
		
		
		

	}

}
