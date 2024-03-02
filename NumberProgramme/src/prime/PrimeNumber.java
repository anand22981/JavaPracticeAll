package prime;

public class PrimeNumber {
    public static void Isprime(int a) {
    	boolean b=true;
    	for(int i=1;i<=a;i++){
    	    for(int j=2;j<i;j++){
    	       
    	       if(i%j==0){
    	           b=false;
    	           
    	           break;
    	       }
    	       else{
    	           b=true;
    	       }
    	       
    	       
    	    }
    	    if(b){
    	    System.out.println(i);
    	     }
    	    
    	}
    }
}
