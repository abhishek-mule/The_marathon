import java.util.Scanner;

public class Factorial {
    public static long iterative(int n){
        long fact = 1;
        for(int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    public static long recursive(int n){
        if(n <= 1) return 1;
        return n * recursive(n - 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Iterative: " + iterative(n));
        System.out.println("Recursive: " + recursive(n));
        System.out.println("Time O(n), Space O(1) iterative / O(n) recursion stack");
    }
}
