package creatingQueue;

import java.util.Scanner;

public class QueueCode 
{
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;
	private Scanner sc = new Scanner(System.in);
	
	public QueueCode(int n){
		q=new int[n];
		size=q.length;
	}
	
	public void insert() {
		int elem;
		if(r==size-1) {
			System.out.println("Insertion not possible ");
		}
		else {
			System.out.println("enter an element ");
			elem=sc.nextInt();
			++r;
			q[r]=elem;
		}
	}
	public void delete() {
		if(r==-1 || f>r) {
			System.out.println("deletion not possible ");
		}
		else {
			System.out.println("element deleted "+q[f]);
			++f;
			
		}
	}
	
	public void disply() {
		if(r==-1 || f>r) {
			System.out.println("display not possible ");
		}
		else {
			for(int i=f;i<=r;i++) {
				System.out.println(q[i]);
			}
			System.out.println();
			
		}
	}

}
