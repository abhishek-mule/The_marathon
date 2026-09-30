import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindrome(String s){
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0, j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println(isPalindrome(s)
                ? "\"" + s + "\" is a palindrome"
                : "\"" + s + "\" is NOT a palindrome");
        System.out.println("Time O(n), Space O(1) - two pointers");
    }
}
