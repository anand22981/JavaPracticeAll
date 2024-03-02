package com.hibernate.ex2.HibernateProj2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Studentex2 
{
    @Id
	int rollNumber;
    String name;
    int age;
    @OneToOne
    Bike bike;
	public Studentex2() {
		
	}
	public Studentex2(int rollNumber, String name, int age,Bike bike) {
		
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.bike=bike;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
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
	public Bike getBike() {
		return bike;
	}
	public void setBike(Bike bike) {
		this.bike = bike;
	}
	
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
