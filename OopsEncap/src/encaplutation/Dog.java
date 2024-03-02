package encaplutation;

public class Dog {
   private String name;
   private int id;
   private String breed;
   //created setter using constructor
   public  Dog(String name,int id,String breed) {
	   this.name=name;
	   this.id=id;
	   this.breed=breed;
   }
   //getter for value
   public String getName() {
	   return name;
   }
   public int getId() {
	return id;
}
   public String getBreed() {
	return breed;
}
   
   
   
   
   
   
}
