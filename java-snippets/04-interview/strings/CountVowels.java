import java.util.Scanner;

public class CountVowels {
    public static int count(String s){
        int c = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') c++;
        }
        return c;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Vowels = " + count(s));
        System.out.println("Time O(n), Space O(1)");
    }
}
