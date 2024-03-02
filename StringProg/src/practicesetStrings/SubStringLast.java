package practicesetStrings;

public class SubStringLast {

	public static void main(String[] args) {
		String s="Omkar";
		for(int i=0;i<=s.length()-1;i++){
		    String temp="";
		    for(int j=i;j<=s.length()-1;j++){
		        temp+=s.charAt(j);
		        System.out.println(temp);
		    }
		   System.out.println("=====================================================");
		}

	}

}
