import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int[] arr){
        int i = 0, j = arr.length - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        reverse(arr);
        System.out.println("Reversed: " + Arrays.toString(arr));
        System.out.println("Time O(n), Space O(1) - two pointer swap");
    }
}
