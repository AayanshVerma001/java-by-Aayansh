// Palindrome Number
public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121, temp = num, rev = 0;
        while(num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println((rev == temp) ? "Palindrome" : "Not Palindrome");
    }
}