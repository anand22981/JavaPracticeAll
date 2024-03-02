package classObj;

public class Shadowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       emp e1= new emp("ashiu",10);
       e1.into();
	}

}
class emp{
	String name;
	int id;
	public emp(String name,int id) {
		this.name=name;
		this.id=id;
	}
	void into() {
		System.out.println("i am emp"+name+" having id"+id);
	}
}