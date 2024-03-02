package creatingArray;
import java.util.Scanner;
public class ArrayDsa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter arr length");
		int n=sc.nextInt();
		Array ar = new Array(n);
		while(true){
		    
		    System.out.print("press1--> insert");
		    System.out.print("press2--> delete");
		    System.out.print("press3--> display");
		    System.out.print("Any other no. for exit");
		    
		    System.out.print("Enter your choice");
		    int choice=sc.nextInt();
		    switch(choice){
		        case 1:ar.insert();
		        break;
		        case 2:ar.delete();
		        break;
		        case 3:ar.dsip();
		        break;
		        default:System.exit(0);
		    }
		}
		
		
		

	}

}

class Array
{
    private int arr[];
    private Scanner sc = new Scanner(System.in);
    public Array(int n){
        arr=new int[n];
    }
    public void insert()
    {
        System.out.println("Enter Position 0 to "+(arr.length-1));
        int pos=sc.nextInt();
        System.out.println("Enter the element ");
        int elem=sc.nextInt();
        arr[pos]=elem;
    }
    public void delete()
    {
        System.out.println("enter the Position to delete the element");
        int pos=sc.nextInt();
        System.out.println("enter delete is "+arr[pos]);
        arr[pos]=0;
    }
    
    public void dsip()
    {
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
