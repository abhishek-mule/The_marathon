public class returnType{

    // This method takes 3 integers and returns the largest one
    public static int findMaximum(int num1, int num2, int num3) {
        int max = num1; // Assume the first number is the largest initially

        if (num2 > max) {
            max = num2; // num2 is bigger, so update max
        }
        
        if (num3 > max) {
            max = num3; // num3 is bigger, so update max
        }

        return max; // Return the final largest number found
    }

    public static void main(String[] args) {
        // Call the method and store the returned value in a variable
        int result = findMaximum(42, 99, 15);
        
        System.out.println("The maximum number is: " + result); 
        // Output: The maximum number is: 99
    }
}

