package interfaceQuestionWithinheri;

public class KodnestApp {

	public static void main(String[] args) {
		JavaTest j = new JavaTest();
		Kodnest ref;
		ref=j;
		((JavaTest)(ref)).startTest();
		SqlTest s = new SqlTest();
		ref=s;
		((SqlTest)(ref)).startTest();

	}

}
