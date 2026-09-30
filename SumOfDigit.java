import java.util.Scanner;

public class SumOfDigit{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	int n = sc.nextInt(); //1234
        int rev = 0;
              
      

	while(n != 0){
	   
          rev *= (n%10);//4
	  n /= 10;

	
	}

      
     System.out.println((rev > 0) ? rev : - rev); 

     
     }



}
