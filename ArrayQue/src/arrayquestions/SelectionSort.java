package arrayquestions;

public class SelectionSort {

	public  int[] SelectSort(int [] arr) {
		for(int i=0;i<=arr.length-2;i++){
		    int min=arr[i];
		    int pos=i;
		    for(int j=i+1;j<=arr.length-1;j++){
		        if(arr[j]<min){
		            min=arr[j];
		            pos=j;
		            
		        }
		    }
		    
		    int help=arr[i];
		    arr[i]=arr[pos];
		    arr[pos]=help;
		}
		return arr;
//		for(int i:arr){
//		    System.out.print(i+" ");
//		}

	}

}
