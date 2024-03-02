package noSpring;

public class School {

	public static void main(String[] args) 
	{
		//tight coupling 
//		JavaTrainer jt=new JavaTrainer();
//		jt.attendace();
//		jt.teach();
		
		JavaTrainer jt=new JavaTrainer();
		
		TestingTrainer tt = new TestingTrainer();
		
		
		SqlTrainer st = new SqlTrainer();
		takeClass(jt);
		takeClass(tt);
		takeClass(st);
	}
	public static void takeClass(Trainer t) {
		t.attendace();
		t.teach();
	}

}
