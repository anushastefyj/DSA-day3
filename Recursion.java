import java.util.Scanner;

public class Recursion {
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        int result = sum(n);
        System.out.println("The sum of the first " + n + " numbers is: " + result);
    }
}
