import java.util.Scanner;


public class maxArr{
  public static void main(String[] args){
       
	  int[] arr = {10, 20, 45, 15, 8};
          int max = arr[0];
	  for(int i=0; i< arr.length; i++){
	  
	     if(arr[i] > max)  max = arr[i];

	   

	    
	  }
	  System.out.println("the max is : "+ max );
           
  
  
  }


}
