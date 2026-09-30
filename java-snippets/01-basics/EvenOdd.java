import java.util.Scanner;

public class EvenOdd {
public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

	 System.out.println("Enter num:");
	 int result = sc.nextInt();

	 System.out.println((result%2 == 0) ? "Even" : "Odd");
 }
}
