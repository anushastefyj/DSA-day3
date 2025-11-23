public class Recursion2 {
    // Recursive method to print numbers from n to 0
    public static void printReverse(int n) {
        if (n < 0) {
            return;   // stop when n becomes negative
        }
        System.out.println(n);
        // recursive call
        printReverse(n - 1);
    }
    public static void main(String[] args) {
        printReverse(10);   // prints 10 to 0
             System.out.println("Start !");
    }
}
