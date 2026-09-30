import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> seen = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int complement = target - arr[i];
            if(seen.containsKey(complement)){
                return new int[]{seen.get(complement), i};
            }
            seen.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        int[] result = twoSum(arr, target);
        if(result[0] == -1){
            System.out.println("No pair found");
        } else {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }
        System.out.println("Time O(n), Space O(n) - HashMap lookup");
    }
}
