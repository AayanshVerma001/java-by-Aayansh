//Nested If-else Statement
//Conditional Operator
// --Logical-AND Operator
//--Logical-OR Operator
//--Ternary Operator

//Write a program to print the value if it is even and divisible by 3.

import java.util.Scanner;

//class ConditionalOperators {
    //public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Enter a number: ");
       // int value = sc.nextInt();



import java.util.Scanner;

//class ConditionalOperators {
    //public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        //System.out.print("Enter a number: ");
        //int value = sc.nextInt();

        //if (value % 2 == 0 && value % 3 == 0) {
          //  System.out.println("Found ans -> " + value);
        //} else {
            //      System.out.println("Number is not even and divisible by 3");
        //}
    //}
//}

//Write a program to print the value if it is divisible by 3 or 5.


 class ConditionalOperator {
    public static void main(String[] args) {
        int number = 20;

        String result = (number % 3 == 0 || number % 5 == 0)
                ? "Divisible by 3 or 5"
                : "Not divisible by 3 or 5";

        System.out.println("Number: " + number);
        System.out.println("Result: " + result);
    }
}












