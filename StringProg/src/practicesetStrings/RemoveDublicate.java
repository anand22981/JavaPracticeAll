package practicesetStrings;

public class RemoveDublicate {

	public static void main(String[] args) {
		String s="idiot";
		String dub="";
		for(int i=0;i<=s.length()-1;i++){
		    if(dub.contains(String.valueOf(s.charAt(i)))==false){
		        dub+=s.charAt(i);
		    }
		}
		System.out.print(dub);

	}

}
