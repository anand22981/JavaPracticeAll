package creatingStack;
import java.util.*;
public class Stack 
{
 private int s[];
 private int size;
 private int top=-1;
 private Scanner sc = new Scanner(System.in);
 
 public Stack(int n) {
	 s=new int[n];
	 size=s.length;
 }
 public void push() {
	 int elem;
	 if(top== size-1) {
		 System.out.println("Push not Possible");
	 }
	 else {
		 System.out.println("enter an element");
		 elem=sc.nextInt();
		 ++top;
		 s[top]=elem;
		 
	 }
 }
 public void pop() {
	 if(top==-1) {
		 System.out.println("Pop not Possible");
	 }
	 else {
		 System.out.println("element delete is "+s[top]);
		 --top;
	 }
 }
 
 public void display() {
	 if(top==-1) {
		 System.out.println("Display not Possible");
	 }
	 else {
		for(int i=top;i>=0;i--) {
			System.out.println(s[i]);
		}
	 }
 }
 
}
