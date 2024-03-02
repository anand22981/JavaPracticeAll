package com.Spring.ex1.Springex1;

public class Student 
{
int roll;
String name;
int yop;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int roll, String name, int yop) {
	super();
	this.roll = roll;
	this.name = name;
	this.yop = yop;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getYop() {
	return yop;
}
public void setYop(int yop) {
	this.yop = yop;
}
@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", yop=" + yop + "]";
}


}
