import java.util.Scanner;
public class ProductOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();
        long product = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            product *= num; // multiply each number
        }
        System.out.println("Product of the " + n + " numbers is: " + product);
    }
}
   