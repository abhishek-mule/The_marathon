import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many terms? ");
        int n = sc.nextInt();

        System.out.print("Series: ");
        int a = 0, b = 1;
        for(int i = 1; i <= n; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("\nTime O(n), Space O(1) - iterative (avoid naive recursion, it is O(2^n))");
    }
}
