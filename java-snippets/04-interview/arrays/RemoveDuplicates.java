import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static int remove(int[] arr){
        if(arr.length == 0) return 0;
        int write = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[write - 1]){
                arr[write] = arr[i];
                write++;
            }
        }
        return write;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter SORTED array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter sorted elements: ");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int len = remove(arr);
        System.out.println("Length = " + len);
        System.out.println("Result = " + Arrays.toString(Arrays.copyOf(arr, len)));
        System.out.println("Time O(n), Space O(1) - in place");
    }
}
