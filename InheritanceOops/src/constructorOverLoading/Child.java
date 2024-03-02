package constructorOverLoading;

public class Child extends Parent
{
 
	int p,q;
	public Child() {
		super(56,10);
		System.out.println("i am 0 parameter in child");
		p=111;
		q=222;
		
	}
	public Child(int p,int q) {
		super(99);
		System.out.println("i am 2 parameter in child");
		this.p=p;
		this.q=q;
		
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(p);
		System.out.println(q);
	}
}
