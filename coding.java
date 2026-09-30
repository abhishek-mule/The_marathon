import java.util.Scanner;

public class coding{
  public static void main(String[] args){
    
      Scanner sc = new Scanner(System.in);
      System.out.print("Ennter Num: ");

      int n = sc.nextInt();

      if(n%3==0 || n%5==0)
	      System.out.println("bhai ye 3 or 5 se divisible h");
      else
	      System.out.println("3 or 5 se nhi hai divisible");

  
  
  }
}
