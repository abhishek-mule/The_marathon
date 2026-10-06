import java.util.*;
public class searchInArr{
  public static void main(String[] args){
        
	Scanner sc= new Scanner(System.in);
	int arr[] = {10, 545 , 6 , 1, 24 ,12};
        

	System.out.print("Enter element to search: ");
	int target = sc.nextInt();

	boolean found = false;

	for(int i =0; i<arr.length; i ++){
	   if(arr[i]== target)
		  found = true;
	          break;	 
	}  
	   if(found) System.out.println("is in array !");
           
	   else System.out.println("Not in array");
	
}  
  
  }

