package advanceLessons2;

public class FibonacciRecursiveWay {
    public static void main(String[] args) {
        System.out.println("Fibonacci recursive solution with return value");
        System.out.println(0);
        for (int i = 0; i <= 7; i++) {

            System.out.println(fibonacciRecursive(i));
        }
    }

    private static int fibonacciRecursive(int n) {

        if (n <= 1) {
            return 1;
        }
        return fibonacciRecursive(n - 2) + fibonacciRecursive(n - 1);
    }
}
