// Fibonacci Series
public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for(int i = 2; i < 10; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}