package Spring.AutoWiringUsingAnnotation.spring.AutowiringUsINGaNNotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class car 
{
	@Autowired
	@Qualifier("d1")
   driver dr;

public car() {
	super();
	// TODO Auto-generated constructor stub
}

public car(driver dr) {
	super();
	this.dr = dr;
}

public driver getDr() {
	return dr;
}

public void setDr(driver dr) {
	this.dr = dr;
}

@Override
public String toString() {
	return "car [dr=" + dr + "]";
}
   
}
