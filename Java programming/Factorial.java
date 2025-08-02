// Factorial of a Number
public class Factorial {
    public static void main(String[] args) {
        int fact = 1, num = 5;
        for(int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial = " + fact);
    }
}