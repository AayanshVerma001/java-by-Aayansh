// Write a program  to find if a number is a power of 2 or not .





// Program to check if a number is a power of 2
//public class Problems {
  //  public static void main(String[] args) {
    //    int num = 16; // You can change this value to test other numbers

      //  if (isPowerOfTwo(num)) {
        //    System.out.println(num + " is a power of 2.");
        //} else {
          //  System.out.println(num + " is NOT a power of 2.");
        //}
   // }

    // Function to check power of 2 using bit manipulation
   // public static boolean isPowerOfTwo(int n) {
        // A number is a power of 2 if it is > 0 and only one bit is set in its binary form
     //   return n > 0 && (n & (n - 1)) == 0;
    //}
//}






// Write a program to toggle a bit a position ="pos" in a number "n".

// Program to toggle a bit at position 'pos' in number 'n'
//public class Problems {
  //  public static void main(String[] args) {
    //    int n = 10;        // Example number (binary: 1010)
      //  int pos = 1;       // Position to toggle (0-based from right)

        //int result = toggleBit(n, pos);

        //System.out.println("Original number: " + n + " (binary: " + Integer.toBinaryString(n) + ")");
        //System.out.println("After toggling bit at position " + pos + ": " + result + " (binary: " + Integer.toBinaryString(result) + ")");
    //}

  //  // Method to toggle bit
    //public static int toggleBit(int n, int pos) {
      //  return n ^ (1 << pos);  // XOR with a mask having 1 at 'pos'
    //}
//}






// Write a Program to count the number of 1's in a binary representation of the number.


// Program to count number of 1's in binary representation
//public class Problems {
  //  public static void main(String[] args) {
    //    int n = 29; // Example number (binary: 11101)

      //  int count = countSetBits(n);

        //System.out.println("Number: " + n);
        //System.out.println("Binary: " + Integer.toBinaryString(n));
        //System.out.println("Number of 1's (set bits): " + count);
    //}

  //  // Function to count set bits using Brian Kernighan’s Algorithm
    //public static int countSetBits(int n) {
      //  int count = 0;
        //while (n > 0) {
          //  n = n & (n - 1); // Clear the least significant bit set
            //count++;
        //}
        //return count;
    //}
//}





//Write 2 function => decimal To Binary () & binary To Decimal () to convert a number from one
//  number system to another.




// Program to convert Decimal <-> Binary using two functions
public class Problems {

    public static void main(String[] args) {
        int decimalNumber = 25;
        String binaryStr = "11001";

        // Convert Decimal to Binary
        String binary = decimalToBinary(decimalNumber);
        System.out.println("Decimal: " + decimalNumber + " → Binary: " + binary);

        // Convert Binary to Decimal
        int decimal = binaryToDecimal(binaryStr);
        System.out.println("Binary: " + binaryStr + " → Decimal: " + decimal);
    }

    // Function to convert decimal to binary
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    // Function to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }
}







