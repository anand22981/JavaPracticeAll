package arrayObject;

public class ArrayObjApp {

	public static void main(String[] args) {
		ArrayObj a1= new ArrayObj(1,"ashiu",80);
		ArrayObj a2= new ArrayObj(2,"ashi",70);
		ArrayObj a3= new ArrayObj(3,"shiu",90);
		
		ArrayObj [] arr = new ArrayObj[3];
		arr[0]=a1;
		arr[1]=a2;
		arr[2]=a3;
		System.out.println(arr[0].id+" "+arr[0].name+" "+arr[0].marks);
		

	}

}
