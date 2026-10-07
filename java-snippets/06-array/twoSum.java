import java.util.*;



public class twoSum{

  public static void main(String[] args){
  
       Scanner sc = new Scanner(System.in);
       int arr[] = {10, 25, 1 , 3, 6, 2};
       
       System.out.println("Enter Target: ");
       int target = sc.nextInt();
      
       boolean flag = false; 

       for(int i =0 ; i<arr.length; i++){
         for(int j = i+ 1 ; j<arr.length; j++){
	 
	  if(arr[i]+ arr[j] == target){
		  
		  System.out.println("Two sum are " + arr[i] + " and " + arr[j]);
	          flag = true;
		  break;
	  }
	 
	  
	 
	 }
       
	 if (flag) break;
       }
     if(! flag){
       System.out.println("Not found ");
      }
   
     sc.close();
  }

}
