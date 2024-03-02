package calculatorTryExceptionqUES;

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		try {
		c.add();
		}
		catch(Exception e) {
			System.out.println("exception handled in app");
		}
		try {
			c.sub();
			}
			catch(Exception e) {
				System.out.println("exception handled in app");
			}
		try {
			c.mul();
			}
			catch(Exception e) {
				System.out.println("exception handled in app");
			}
		try {
			c.div();
			}
			catch(Exception e) {
				System.out.println("exception handled in app");
			}

	}

}
