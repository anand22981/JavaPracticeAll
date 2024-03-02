package loops;

public class Homework {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {//school number
			for( int j=1;j<=2;j++) {//class loop
				for(int k =1;k<=10;k++) {//student loop
					if(i%2!=0 && k%2==0) {
						System.out.println("student completed assignment of school "+i+" student "+k);
					}
					else if(i%2==0 && k%2!=0) {
						System.out.println("student not completed assignment of school "+i+" student "+k);
					}
					else {
						System.out.println("school "+i+" student "+k+" still doing");
					}
				}
			}
			System.out.println("assignment check completed");
		}

	}

}
