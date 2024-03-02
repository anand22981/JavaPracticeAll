package customException;

public class DrivingLicApp {

	public static void main(String[] args) {
		try {
		DrivingLicince d = new DrivingLicince();
		d.applyDl();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
