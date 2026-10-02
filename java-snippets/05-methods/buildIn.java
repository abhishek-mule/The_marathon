import java.util.Scanner;

public class buildIn {
 public static void main(String[] args){

	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a");
	 int a = sc.nextInt();
	 System.out.println("Enter b");
         int b = sc.nextInt();
	 System.out.println("Enter c");
	 int c = sc.nextInt();
        System.out.println(Math.sqrt(4));
        System.out.println(Math.cbrt(5));
        System.out.println(Math.floor(-8.4));
        System.out.println(Math.ceil(3.0001));
        System.out.println(Math.min(4654, 654));
        System.out.println(Math.max(4546, 8746));
        System.out.println(Math.abs(-543));
        System.out.println(Math.max(Math.max(a, b),c));
     
 
 }

}
