package school.manyTomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Teacher 
{
	@Id
int id;
String name;
@ManyToMany
List<Subject> sList;
public Teacher() {
	super();
	// TODO Auto-generated constructor stub
}
public Teacher(int id, String name, List<Subject> sList) {
	super();
	this.id = id;
	this.name = name;
	this.sList = sList;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Subject> getsList() {
	return sList;
}
public void setsList(List<Subject> sList) {
	this.sList = sList;
}
@Override
public String toString() {
	return "Teacher [id=" + id + ", name=" + name + ", sList=" + sList + "]";
}


}
