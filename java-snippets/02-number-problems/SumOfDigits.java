import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        int temp = Math.abs(n);

        while(temp > 0){
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}
