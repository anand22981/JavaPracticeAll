package constructorOverLoading;

public class Parent {
	int x,y;
	public Parent()
	{
		System.out.println("Parent 0 Paramenter");
		x=10;
		y=20;
	}
	public Parent(int x)
	{
		System.out.println("Parent 1 Paramenter");
		this.x=x;
		y=25;
	}
	public Parent(int x,int y)
	{
		System.out.println("Parent 2 Paramenter");
		this.x=x;
		this.y=y;
	}

}
