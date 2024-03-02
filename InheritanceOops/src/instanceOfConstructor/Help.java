package instanceOfConstructor;

public class Help 
{
  void doAct(SoftwareEngg se) 
  {
	   if(se instanceof PythonDev) 
	  {
		  ((PythonDev) se).doBackendProj();
		  ((PythonDev) se).learnPython();
	  }
	   else if(se instanceof BackendDev) {
		  se.attendMeeting();
		  ((BackendDev) se).doBackendProj();
	  }
	  else if(se instanceof FrontEndDev) 
	  {
		  se.attendMeeting();
		  ((FrontEndDev) se).doFrontProj();
		  ((FrontEndDev) se).Learnfrontend();
	  }
	  
  }
}
