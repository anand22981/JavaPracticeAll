package curd.operation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Citizen 
{
@Id
int aadhar;
String name;
int age;
public Citizen() {
	super();
	// TODO Auto-generated constructor stub
}
public Citizen(int aadhar, String name, int age) {
	super();
	this.aadhar = aadhar;
	this.name = name;
	this.age = age;
}
public int getAadhar() {
	return aadhar;
}
public void setAadhar(int aadhar) {
	this.aadhar = aadhar;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Citizen [aadhar=" + aadhar + ", name=" + name + ", age=" + age + "]";
}



}
