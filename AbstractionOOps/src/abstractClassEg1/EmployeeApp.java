package abstractClassEg1;

public class EmployeeApp {

	public static void main(String[] args) {
		Devloper d1 = new Devloper();
		TestingEmp t = new TestingEmp();
		Company c = new Company();
		c.display(d1);
		System.out.println("----------->");
		c.display(t);
		

	}

}
