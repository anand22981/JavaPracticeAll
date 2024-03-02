package sumOfDigit;

public class DigitSum {
         public static void Sum(int a) {
        	 int sum=0;
     		//while a==0
     		while(a>0) {
     			sum+=a%10;
     			a=a/10;
     			//sum+=n;//adding last digit in sum
     		}
     		System.out.println(sum);//printing 
         }
}
