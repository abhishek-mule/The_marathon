import java.util.*;


public class secondMaxArr{
  public static void main(String[] args){
    
	   int arr[] = {10,58, 62, 90, 35};
	   int n = arr.length;
	   int max = Integer.MIN_VALUE;
           int smax = Integer.MIN_VALUE;

	  for(int i =0; i<n; i++){
	  
	   if(arr[i]>max) max = arr[i];


	  }

	  for(int i = 0; i<n; i++){
	  if(arr[i]> smax && arr[i]!=max  )  smax = arr[i];
               
	  
	  }

	  System.out.println("the largest is "+ max );
	  System.out.println("the second largest is: " + smax);

  
  }


}
