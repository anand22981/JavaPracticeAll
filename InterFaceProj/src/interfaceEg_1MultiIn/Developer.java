package interfaceEg_1MultiIn;

public class Developer implements JavaTeacher,PythonTeacher,SQLTeacher
{
public void javaFeature() 
{
	System.out.println("Developer is learning java");
}
public void PythonFeature() 
{
	System.out.println("Developer is learning python");
}
public void SQLFeature() 
{
	System.out.println("Developer is learning SQL");
}
}
