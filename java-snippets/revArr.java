//reverse of iarr

import java.util.*;

public class revArr{

 public static void main(String[] args){
 
    int[] arr = {15, 65,87,21,34};
    int i = 0;
    int n = arr.length;
    int j= n-1;
    while(i < j ){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] =temp;

      i++;
      j--;
      
    }
   for(int ele : arr) System.out.println(ele+ " ");
 
 }

}
