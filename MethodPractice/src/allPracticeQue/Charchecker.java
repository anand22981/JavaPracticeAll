package allPracticeQue;

public class Charchecker {
	public static void Check(char ch) {
	if(Character.isDigit(ch)){
	    System.out.println("digit");
	}
	else if(ch>='A' && ch<='Z'){
	    
	    if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'){
	        System.out.println("character in upper letter and vowel");
	    }
	    else{
	        System.out.println("character in upper letter and constanant");
	    }
	    
	}
	else if(ch>='a' && ch<='z'){
	    if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
	        System.out.println("character in lower  and vowel");
	    }
	    else{
	        System.out.println("character in lower  letter and constanant");
	    }
	    
	}
	
	else{
	    System.out.println("special character");
	}

}}
