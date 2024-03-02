package demo.comhiber;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
//@Table(name="stud") for changing name of table s
public class Student {
	@Id
	 int roll;
	 String name;
	 int yop;
	 //@OneToOne
	 @OneToOne
	 Bike bike;
	public Student(int roll, String name, int yop, Bike bike) {
		super();
		this.roll = roll;
		this.name = name;
		this.yop = yop;
		this.bike = bike;
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
	public Bike getBike() {
		return bike;
	}
	public void setBike(Bike bike) {
		this.bike = bike;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", yop=" + yop + ", bike=" + bike + "]";
	}
	 
	 
//	public Student() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Student(int roll, String name, int yop) {
//		super();
//		this.roll = roll;
//		this.name = name;
//		this.yop = yop;
//	}
//	public int getRoll() {
//		return roll;
//	}
//	public void setRoll(int roll) {
//		this.roll = roll;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getYop() {
//		return yop;
//	}
//	public void setYop(int yop) {
//		this.yop = yop;
//	}
//	@Override
//	public String toString() {
//		return "Student [roll=" + roll + ", name=" + name + ", yop=" + yop + "]";
//	}
	 
}
