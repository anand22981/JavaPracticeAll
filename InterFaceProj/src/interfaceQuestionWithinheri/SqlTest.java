package interfaceQuestionWithinheri;

public class SqlTest extends Test implements Technology {

	void startTest() {
		System.out.println("sql test is start "+timeDuration+" min left");
	}
	void endTest() {
		System.out.println(" sql test end");
	}
	public void EasyQuestion() {
		System.out.println("sql test is easy");
	}
}
