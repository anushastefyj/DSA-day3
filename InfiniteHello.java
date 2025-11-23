public class InfiniteHello {
    public static void hello() {
        System.out.println("Hello");
        hello(); // recursive call
    }
    public static void main(String[] args) {
        hello();
    }
}
