package multipleMethodUDEH;

public class Prog2 {
	void disp2() {
		System.out.println("execution of disp2 started");
		Prog1 p1 = new Prog1();
		p1.disp1();
		System.out.println("disp2 ended");
	}

}
