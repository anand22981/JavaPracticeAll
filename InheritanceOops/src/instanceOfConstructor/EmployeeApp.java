package instanceOfConstructor;

public class EmployeeApp {

	public static void main(String[] args) {
		BackendDev bd = new BackendDev();
		
		FrontEndDev fd = new FrontEndDev();
		
		Help hc = new Help();
		hc.doAct(bd);
		
		hc.doAct(fd);
		
		PythonDev pd = new PythonDev();
		hc.doAct(pd);

	}

}
