public class RecursiveMax {
    // Recursive method to find max value
    public static int max(int[] a, int i) {
        // Base case: last index
        if (i == a.length - 1) {
            return a[i];
        }
        // Recursively find max in the rest of the array
        int rest = max(a, i + 1);
        // Return maximum using Math.max
        return Math.max(a[i], rest);
    }
    public static void main(String[] args) {
        int[] a = {3, 9, 2, 15, 6};  
        int result = max(a, 0);     
        System.out.println("Max value: " + result);
    }
}
