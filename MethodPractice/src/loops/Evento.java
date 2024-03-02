package loops;
//wa jp to print no. from -100 to 100 and if no is even and +ve print it and if -ve and odd print it
public class Evento {

	public static void main(String[] args) {
		for(int i=-100;i<=100;i++) {//loop for -100 to 100 outer loop
			if(i%2==0 && i>0) {//checking if true
				System.out.println(" even and +ve "+i);
			}
			else if(i%2!=0 && i<0) {
				System.out.println(" odd and -ve "+i);
			}
		}

	}

}
