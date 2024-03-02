package classObj;

public class AnomusPra {

	public static void main(String[] args) {
		
        new anomus("ashiu",10).study();
	}

}
class anomus{
	String name;
	int age;
	public anomus(String a,int b) {//if instance variable name is same as local then we face shadowing problem
		name=a;//if we take name=name then we facing shadowing problem
		age=b;
	}
	void study(){
		System.out.println("name is "+name+" and age is "+age);
	}
}
