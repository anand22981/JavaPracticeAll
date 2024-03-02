package encaplutation;

public class ConstructorExDogApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //for construcor we have to insilise variable while creating obj
		Dog d1 = new Dog("Bruno",20,"Husky");
		System.out.println(d1.getBreed());
		System.out.println(d1.getName());
	}

}
