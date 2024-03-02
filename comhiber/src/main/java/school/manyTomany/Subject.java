package school.manyTomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Subject 
{
@Id
int sId;
String name;
@ManyToMany
List<Teacher>tlist;
public Subject() {
	super();
	// TODO Auto-generated constructor stub
}
public Subject(int sId, String name, List<Teacher> tlist) {
	super();
	this.sId = sId;
	this.name = name;
	this.tlist = tlist;
}
public int getsId() {
	return sId;
}
public void setsId(int sId) {
	this.sId = sId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Teacher> getTlist() {
	return tlist;
}
public void setTlist(List<Teacher> tlist) {
	this.tlist = tlist;
}
@Override
public String toString() {
	return "Subject [sId=" + sId + ", name=" + name + ", tlist=" + tlist + "]";
}


}
