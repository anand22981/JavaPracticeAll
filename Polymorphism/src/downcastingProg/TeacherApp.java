package downcastingProg;

public class TeacherApp {

	public static void main(String[] args) {
		Teacher ref;
		JavaTeacher jt = new JavaTeacher();
		PythonTeacher pt = new PythonTeacher();
		
		ref = jt;
		ref.assignment();
		ref.teach();
		//ref.javaProj();--> this is error cause of javaProj is special method in javateacher
        ((JavaTeacher)(ref)).javaProj();//now ref act like a child 
        
        ref = pt;
		ref.assignment();
		ref.teach();
		//ref.pythonProj();--> this is error cause of javaProj is special method in javateacher
        ((PythonTeacher)(ref)).pythonProj();
	}

}
