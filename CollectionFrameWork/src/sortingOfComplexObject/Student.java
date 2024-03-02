package sortingOfComplexObject;

public class Student 
{
String name;
int age;
float marks;
public Student(String name, int age, float marks) {
	super();
	this.name = name;
	this.age = age;
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
}



}


