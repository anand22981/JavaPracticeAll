package sortingOfComplexObject;

public class Employee implements Comparable
{
int id;
String name;
int salary;
public  Employee(int id,String name,int salary) {
	this.id=id;
	this.name=name;
	this.salary=salary;
	
}
public String toString() {
	return "Emplooyee[Id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
@Override
public int compareTo(Object o) {
	if(this.id>((Employee)(o)).id) {
		return 1;
	}
	else {
		return -1;
	}
	
}
}
