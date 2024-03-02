package pattern;
import java.util.*;
public class EvenOddsquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int c=0;//initialization c is 0
		int d=(a/2)*a; //half the a and multiple with it 
		int x=d; //copy of d in x
		
		//col loop from 1 to a
		for(int i=1;i<=a;i++){
			
			//row loop for 1 to a and priniting c
		   for(int j=1;j<=a;j++){
		       c++;//incrementing c=c+1
		    if(d>=c){//checking if true or not
		        
		        System.out.print(c+c+" ");//printing add(c+c) and a space for next int
		    }
		       else{//if flase then execute
		           
		          System.out.print(c-x+" "); //sub x and c
		          x--;//decrement x
		       }
		   }
		    System.out.println();//for next line or line break
		}

	}

}
