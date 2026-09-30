import java.util.Scanner;

public class PrimeCheck {
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        if(n <= 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;
        for(int i = 5; i * i <= n; i += 6){
            if(n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(n + (isPrime(n) ? " is prime" : " is NOT prime"));
        System.out.println("Optimised loop runs till sqrt(n) -> O(sqrt(n))");
    }
}
