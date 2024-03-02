package classObj;

public class StudentAppTwo {

	public static void main(String[] args) {
		StudentTwo s1= new StudentTwo();
		s1.name="astang";
		s1.age=20;
		s1.intro();
		new StudentTwo().study();//anonmymus object :- used only once and dont have refrence variable

	}

}
class StudentTwo{
	String name;
	int age;
	void intro() {
		System.out.println("my name is "+name+" and i am "+age);
	}
	
	void study() {
		System.out.println("i am studying"+name);
	}
}
