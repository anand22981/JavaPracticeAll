package com.hibernate.Proj4.HibernateProj4;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee
{

	@Id
	int E_id;
	String name;
	String E_team;
	@ManyToMany
	List<Technology> tech;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int e_id, String name, String e_team, List<Technology> tech) {
		super();
		E_id = e_id;
		this.name = name;
		E_team = e_team;
		this.tech = tech;
	}
	public int getE_id() {
		return E_id;
	}
	public void setE_id(int e_id) {
		E_id = e_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getE_team() {
		return E_team;
	}
	public void setE_team(String e_team) {
		E_team = e_team;
	}
	public List<Technology> getTech() {
		return tech;
	}
	public void setTech(List<Technology> tech) {
		this.tech = tech;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
