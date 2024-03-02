package poductConsumerProblem;

public class PizzaHouse 
{
   int PizzaNo;
   boolean status=false;
   synchronized public void bake(int x) 
   {
	   try {
	   if(status==true) {
		   wait();
	   }
	   else {
		   PizzaNo=x;
		   System.out.println(" backer is backed "+ PizzaNo);
	       status=true;
	       notify();
	   }
	   }
	   catch(Exception e) 
	   {
		   e.printStackTrace();
	   }
	   
   }
   synchronized  public void eat()
   {
	   try {
	   if(status==true) {
	   System.out.println("Eater has consume pizza"+PizzaNo);
       status=false;
       notify();
	   }
	   else{
		   wait();
		   }
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   }
}
