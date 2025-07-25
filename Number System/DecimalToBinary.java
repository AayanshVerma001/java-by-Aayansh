import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        // Convert to binary using built-in method
        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary equivalent: " + binary);

        sc.close();
    }
}