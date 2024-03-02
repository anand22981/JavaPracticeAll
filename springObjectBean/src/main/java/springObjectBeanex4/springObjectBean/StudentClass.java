package springObjectBeanex4.springObjectBean;

public class StudentClass 
{
  Trainer tr;

public StudentClass() {
	super();
	// TODO Auto-generated constructor stub
}

public StudentClass(Trainer tr) {
	super();
	this.tr = tr;
}



public Trainer getTr() {
	return tr;
}

public void setTr(Trainer tr) {
	this.tr = tr;
}

@Override
public String toString() {
	return "StudentClass [tr=" + tr + "]";
}
  
}
