package storingInArray;
import java.util.Scanner;
public class SumOfallElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size: ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("enter element : "+arr.length+" time");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		int [] sum =new int [arr.length];
		sc.close();
		for(int i=0;i<=arr.length-1;i++)
		{
		    for(int j=1;j<=arr[i];j++)
		    {
		        sum[i]+=j;
		    }
		}
		System.out.println("sum of each element is: ");
		for(int i:sum)
		{
		    System.out.print(i+" ");
		}

	}

}
