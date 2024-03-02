package allPracticeQue;

public class Armstrong {

	public static void main(String[] args) {
		int a=1634;
		int size=4;//size you have to give but in below we don't have to pass 
		int ans=0;
		while(a>0) {
			int z=1;
			int n=a%10;
			a=a/10;
			for(int i=1;i<=size;i++) {
				z*=n;
				
			}//System.out.println(z);
			ans+=z;
			
		}System.out.println(ans);

	}

}
//public class Main
//{
//	public static void main(String[] args) {
//		int num=1634;
//		int num1=num;
//		int num2=num;
//		int min=0;
//		
//		
//		while(num>0){
//		 int n=num%10; 
//		num=num/10;
//		min++;
//
//	}
//	
//	  while(num1>0){
//	      int z=1;
//	      int n=num1%10;
//	      num1=num1/10;
//	      for(int i=1;i<=min;i++){
//	          z*=n;
//	      }
//	      num+=z;
//	  }System.out.println(num);
//	  
//	  if(num2==num){
//	      System.out.println("armstrong");
//	  }
//	  else{
//	      System.out.println("not");
//	  }
//	}
//	
//}