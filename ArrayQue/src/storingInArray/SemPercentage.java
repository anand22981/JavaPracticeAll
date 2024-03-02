package storingInArray;
import java.util.Scanner;
public class SemPercentage {

	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter no. of semester : ");
		
		//taking number of semester 
		int sem = sc.nextInt();
		
		//making array of float type 
		float perc [] = new float[sem];
		
		//loop 0 to array length to store the value of percentage
		for(int i=0;i<perc.length;i++) 
		{
			System.out.println("enter percentage of sem " + (i+1));
			//taking input from user and passing that into perc array
			perc[i]=sc.nextFloat();
		}
		
		sc.close();
		
		//printing array by using loop from 0 to array length-1
		for(int i=0;i<=perc.length-1;i++)
		{
			System.out.println("% of sem "+(i+1)+" is :"+perc[i]);
		}
		

	}

}
