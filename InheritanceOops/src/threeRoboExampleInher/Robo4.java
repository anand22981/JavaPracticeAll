package threeRoboExampleInher;

public class Robo4 {

	public static void main(String[] args) {
		TeacherRobo t1= new TeacherRobo();
		t1.name="Chitti";
		t1.type="Humanoid";
		t1.talk();
		t1.walk();
		t1.charge();
		t1.teach();
		
		System.out.println("------------------->");
		ChefRobo c1 = new ChefRobo();
		c1.name="Ambi";
		c1.type="armHumanoid";
		c1.talk();
		c1.walk();
		c1.charge();
		c1.cooking();
		
		System.out.println("------------------->");
		DriverRobo d1 = new DriverRobo();
		d1.name="Bumbblebee";
		d1.type="bot";
		d1.talk();
		d1.walk();
		d1.charge();
		d1.Drive();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
