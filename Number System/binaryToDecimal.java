//A number system defines how numbers are represented using different bases or radices.
//Each number system has a base which tells how many unique digits it uses.
// In java , number systems are especially important for:
// 1.Low level programming
// 2.Data conversion
// 3.Displaying values in different formates
// 4.Competitive programming

// Types of Number System in Java
// 1.Decimal
// 2.Binary
// 3.Octal
// 4.Hexadecimal

import java.util.Scanner;

 class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryStr = sc.nextLine();

        try {
            // Convert binary string to decimal
            int decimal = Integer.parseInt(binaryStr, 2);
            System.out.println("Decimal equivalent: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number. Only 0 and 1 are allowed.");
        }

        sc.close();
    }
}