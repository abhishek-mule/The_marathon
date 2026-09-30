import java.util.Scanner;

public class ReverseString {
    public static String reverse(String s){
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        while(i < j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Reversed: " + reverse(s));
        System.out.println("Built-in: " + new StringBuilder(s).reverse());
        System.out.println("Time O(n), Space O(n)");
    }
}
