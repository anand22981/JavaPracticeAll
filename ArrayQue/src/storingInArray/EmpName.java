package storingInArray;
import java.util.*;
public class EmpName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of emp: ");
		int size = sc.nextInt();
		
		String emp[]= new String[size];
		
		for(int i=0;i<=emp.length-1;i++) {
			System.out.println("enter name of emp "+(i+1));
			emp[i]=sc.next();
		}
		sc.close();
		for(int i=0;i<=emp.length-1;i++) {
			System.out.println("name of emp "+(i+1)+" is :"+emp[i]);
			
		}
	}

}
