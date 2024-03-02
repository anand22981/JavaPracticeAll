package demo.comhiber;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bike {
	@Id
	int bikeId;
	String bikeBrand;
	int bikePrize;
	@OneToOne
	Student stud;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(int bikeId, String bikeBrand, int bikePrize, Student stud) {
		super();
		this.bikeId = bikeId;
		this.bikeBrand = bikeBrand;
		this.bikePrize = bikePrize;
		this.stud = stud;
	}
	public int getBikeId() {
		return bikeId;
	}
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}
	public String getBikeBrand() {
		return bikeBrand;
	}
	public void setBikeBrand(String bikeBrand) {
		this.bikeBrand = bikeBrand;
	}
	public int getBikePrize() {
		return bikePrize;
	}
	public void setBikePrize(int bikePrize) {
		this.bikePrize = bikePrize;
	}
	public Student getStud() {
		return stud;
	}
	public void setStud(Student stud) {
		this.stud = stud;
	}
	@Override
	public String toString() {
		return "Bike [bikeId=" + bikeId + ", bikeBrand=" + bikeBrand + ", bikePrize=" + bikePrize + ", stud=" + stud
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
