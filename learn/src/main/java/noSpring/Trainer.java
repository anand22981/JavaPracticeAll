package noSpring;

public interface Trainer 
{
  void attendace();
  void teach();
}
class JavaTrainer implements Trainer{
	public void attendace() {
		System.out.println("Java trainer is taking attendance");
		
	}
	public void teach() {
		System.out.println("Java trainer is teaching java");
		
	}
	
}


class TestingTrainer implements Trainer{
	public void attendace() {
		System.out.println("Testing trainer is taking attendance");
		
	}
	public void teach() {
		System.out.println("Testing trainer is teaching java");
		
	}
	
}

class SqlTrainer implements Trainer{
	public void attendace() {
		System.out.println("Sql trainer is taking attendance");
		
	}
	public void teach() {
		System.out.println("Sql trainer is teaching java");
		
	}
	
}



