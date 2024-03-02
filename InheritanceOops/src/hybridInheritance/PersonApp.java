package hybridInheritance;

public class PersonApp {

	public static void main(String[] args) {
		EngginearStudent e1 = new EngginearStudent();
		BcomStudent bs = new BcomStudent();
		JavaTeacher jt = new JavaTeacher();
		System.out.println(e1.name);
		bs.work();
		jt.work();
		

	}

}
