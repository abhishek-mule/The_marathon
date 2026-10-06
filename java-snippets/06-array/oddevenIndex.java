import java.util.Arrays;


public class oddevenIndex{
    public static void main(String[] args){
       int arr[] = {10,5,27,87,3,4};
      
       for(int i =0; i< arr.length; i++){

            if( i % 2 == 0) arr[i] = arr[i]+10;
	    
	    else arr[i]= 2*arr[i];  
       
           
       }
     System.out.println(Arrays.toString(arr));
    
    }


}
