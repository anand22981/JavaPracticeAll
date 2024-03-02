package synchronizedLockBlock;

public class LibraryApp {

	public static void main(String[] args) {
		Library t1 = new Library();
		Library t2 = new Library();
		
		t1.setName("ashiu");
		t2.setName("cristo");
		
		t1.start();
		t2.start();

	}

}
