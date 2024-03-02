package superforVar;

public class Prog3 extends Prog2
{
	int x=30;
	  void display3() {
		  System.out.println(x);
		  System.out.println(super.x);
		  //System.out.println(super.super.x); we can't accesss grandfather
	  }
}
