package reThrowingException;

public class Prog2 
{
void disp2() {
	try {
	System.out.println("Programm2 display2 is started");
	Prog1 p =new Prog1();
	p.disp1();
	}
	catch(Exception e){
		System.out.println("Exception is handled in prog2");
	}
	System.out.println("display2 is ended.:)");
}	
}
