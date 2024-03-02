package poductConsumerProblem;

public class Baker implements Runnable
{
PizzaHouse ph;
public Baker(PizzaHouse ph) 
{
	this.ph=ph;
}
public void run() 
{
	int x=1;
	while(true)
	{
		ph.bake(x++);
	}
}
}
