import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static boolean areAnagrams(String a, String b){
        a = a.replaceAll("\\s", "").toLowerCase();
        b = b.replaceAll("\\s", "").toLowerCase();
        if(a.length() != b.length()) return false;

        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        return Arrays.equals(ca, cb);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = sc.nextLine();
        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        System.out.println(areAnagrams(a, b)
                ? "They are anagrams"
                : "They are NOT anagrams");
        System.out.println("Sort approach: O(n log n). Frequency-count approach: O(n)");
    }
}
