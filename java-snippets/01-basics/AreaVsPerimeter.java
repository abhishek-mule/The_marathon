import java.util.Scanner;

public class AreaVsPerimeter {
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.println("enter length: ");
       
       int length = sc.nextInt();

       System.out.println("enter breadth: ");
       int breadth = sc.nextInt();
       int area = length * breadth;
       int perimeter = 2 * (length+breadth);

       if(area > perimeter) System.out.println("Area is greater than Perimeter");
       else if(perimeter > area)System.out.println("Perimeter is greater");
       
       else System.out.println("Both are equal");
    }
}
