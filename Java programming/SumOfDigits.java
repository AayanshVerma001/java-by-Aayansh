//  Sum of Digits
public class SumOfDigits {
    public static void main(String[] args) {
        int num = 123, sum = 0;
        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum = " + sum);
    }
}