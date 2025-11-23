public class TailRecursiveFactorial {
    // Public method to call
    public static long factorial(int n) {
        return factorialHelper(n, 1);
    }
    // Tailrecursive helper method
    private static long factorialHelper(int n, long acc) {
        if (n == 0 || n == 1) {
            return acc;
        }
        return factorialHelper(n - 1, n * acc);
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is " + factorial(num));  // Output: 120
    }
}
