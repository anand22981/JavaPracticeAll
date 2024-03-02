package stringselfQuestion;
//input-> "hello world" output-> "Olleh Dlrow"
import java.util.Scanner;
public class ReverseStringSameIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a word");
		String s=sc.nextLine();
		String arrs[]=s.split(" ");
		String x="";
		for(int i=0;i<=arrs.length-1;i++) {
			String rev="";
			for(int j=arrs[i].length()-1;j>=0;j--) {
				char ch=arrs[i].charAt(j);
				rev+=ch;
			}
			String res=rev.substring(0,1).toUpperCase()+rev.substring(1);
			
			x+=res+" ";
		}
		System.out.println(x.substring(0,s.length()));
        sc.close();
	}

}
