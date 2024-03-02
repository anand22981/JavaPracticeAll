package hierachicalInheritance;

public class EmployeeApp {

	public static void main(String[] args) {
	Manager m1 = new Manager();
	m1.name="ashiu";
	m1.salary=20000;
	m1.intro();
	
	System.out.println("--------------------------------------------");
	Deveplor d1 = new Deveplor();
	d1.name="ashiu cristo";
	d1.salary=30000;
	d1.intro();
	
	System.out.println("--------------------------------------------");
	TeamLeader t1 = new TeamLeader();
	t1.name="ashiu martin";
	t1.salary=40000;
	t1.intro();
	
	

	}

}
