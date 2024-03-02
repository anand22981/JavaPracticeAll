package loops;

public class MultipleTaskClass {
	
  public static void divTwo(int n) {
	  System.out.print("divided by 2 : ");
	  for(int i=1;i<=n;i++) {
		  if(i%2==0) {
			  System.out.print(i+" ");
		  }
	  }
  }
  
  
  public static void divThree(int n) {
	  System.out.print("divided by 3 : ");
	  for(int i=1;i<=n;i++) {
		  if(i%3==0) {
			  System.out.print(i+" ");
		  }
	  }
  }
  
  public static void divFive(int n) {
	  System.out.print("divided by 5 : ");
	  for(int i=1;i<=n;i++) {
		  if(i%5==0) {
			  System.out.print(i+" ");
		  }
	  }
  }
  
  public static void divTwoFive(int n) {
	  System.out.print("divided by 2 and 5 : ");
	  for(int i=1;i<=n;i++) {
		  if(i%5==0&&i%2==0) {
			  System.out.print(i+" ");
		  }
	  }
  }
  public static void divThreeFive(int n) {
	  System.out.print("divided by 3 and 5 : ");
	  for(int i=1;i<=n;i++) {
		  if(i%5==0&&i%3==0) {
			  System.out.print(i+" ");
		  }
	  }
  } 
  
  public static void prime(int n) {
	  System.out.print("all prime : ");
	  boolean s=true;
	  for(int i=1;i<n;i++) {
		  for(int j=2;j<i;j++) {
			  if(i%j==0) {
				  s=false;
				  break;
			  }
			  else {
				  s=true;
			  }
		  }if(s) {
			  System.out.print(" "+i);
		  }
	  }
  }
  
  public static void primeEven(int n) {
	  System.out.print("all prime even : ");
	  boolean s=true;
	  for(int i=1;i<n;i++) {
		  if(i%2==0) {
		  for(int j=2;j<i;j++) {
			  if(i%j==0) {
				  s=false;
				  break;
			  }
			  else {
				  s=true;
			  }
		  }if(s) {
			  System.out.print(" "+i);
		  }
	  }
  }}
  
  public static void primeOdd(int n) {
	  System.out.print("all prime even : ");
	  boolean s=true;
	  for(int i=1;i<n;i++) {
		  if(i%2!=0) {
		  for(int j=2;j<i;j++) {
			  if(i%j==0) {
				  s=false;
				  break;
			  }
			  else {
				  s=true;
			  }
		  }if(s) {
			  System.out.print(" "+i);
		  }
	  }
  }}
  public static void evenDiv3(int n){
	  System.out.print("even and divisible by 3: ");
	  for(int i =1;i<=n;i++) {
		  if(i%3==0 && i%2==0) {
			  System.out.print(" "+i);
		  }
	  }
  }
  
  public static void oddDiv5(int n){
	  System.out.print("even and divisible by 3: ");
	  for(int i =1;i<=n;i++) {
		  if(i%5==0 && i%2!=0) {
			  System.out.print(" "+i);
		  }
	  }
  }
}
