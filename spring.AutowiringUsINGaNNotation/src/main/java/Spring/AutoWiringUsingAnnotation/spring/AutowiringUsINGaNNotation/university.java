package Spring.AutoWiringUsingAnnotation.spring.AutowiringUsINGaNNotation;

public class university 
{
	professor p;

	public university() {
		super();
		// TODO Auto-generated constructor stub
	}

	public university(professor p) {
		super();
		this.p = p;
	}

	public professor getP() {
		return p;
	}

	public void setP(professor p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "university [p=" + p + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
