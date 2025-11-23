public class MutualRecursion {
    // Function to check if a number is even
    public static boolean isEven(int n) {
        if (n == 0) return true;          // Base case: 0 is even
        return isOdd(n - 1);              // Mutual recursion: call isOdd
    }
    // Function to check if a number is odd
    public static boolean isOdd(int n) {
        if (n == 0) return false;         // Base case: 0 is not odd
        return isEven(n - 1);             // Mutual recursion: call isEven
    }
    public static void main(String[] args) {
        int num = 7;
        if (isEven(num)) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
