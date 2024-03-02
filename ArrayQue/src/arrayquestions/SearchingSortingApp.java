package arrayquestions;
import java.util.Scanner;
public class SearchingSortingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array:");
		int[] arr = new int[sc.nextInt()];
		System.out.println("enter array of size "+ arr.length);
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter key to find:");
		int key=sc.nextInt();
		System.out.println("enter 1 for binary 2 for insertion 3 for selection:");
		int n=sc.nextInt();
		SearchBinary s1=new SearchBinary();
		switch(n) {
			case 1:
				Sort b1 = new Sort();
			    b1.Bublesort(arr);
			    s1.Binary(arr, key);
			    break;
			case 2: 
				SelectionSort ss= new SelectionSort();
				ss.SelectSort(arr);
				s1.Binary(arr, key);
				break;
			default:
				InsertionSort Is= new InsertionSort();
				Is.InsertSort(arr);
				s1.Binary(arr, key);
			

	}

}}
