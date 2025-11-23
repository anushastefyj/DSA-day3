public class FibonacciTreeRecursion {
    // to calculate nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) return 0;   // Base case
        if (n == 1) return 1;   // Base case
        //tree recursion
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println("Fibonacci number at position " + n + " is " + fibonacci(n));
        // Output 0, 1, 1, 2, 3, 5, 8)
    }
}
