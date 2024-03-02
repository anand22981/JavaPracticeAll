package poductConsumerProblem;

public class Eater implements Runnable
{
	PizzaHouse ph;
	public Eater(PizzaHouse ph) 
	{
		this.ph=ph;
	}
	public void run() 
	{
		
		while(true)
		{
			ph.eat();
		}
	}
}
