import java.util.Arrays;

public class sortedArr{
    public static void main(String[] args){
        int arr[] = {4,1,5,6,87,7};
	print(arr);
	Arrays.sort(arr);
	print(arr);
    }
public static void print(int[] arr){
   for(int i =0; i< arr.length; i++){
      
	   System.out.print(" "+ arr[i]);
    
   
   }
   System.out.println();
		  

}


}
