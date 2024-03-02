package multiThreadingThreadClass;

public class MultiThreadingApp {

	public static void main(String[] args) {
		Addition a = new Addition();
		NumberPrinting np= new NumberPrinting();
		a.start();
		np.start();

	}

}
