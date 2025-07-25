
import java.util.Scanner;

//public class Arrays {
    //public static void main(String[] args) {
   //     Scanner sc = new Scanner(System.in);

       // int[] numbers = new int[5]; // Declare array of 5 integers

        //System.out.println("Enter 5 numbers:");
        //for (int i = 0; i < numbers.length; i++) {
          //  numbers[i] = sc.nextInt(); // Take input for each index
        //}

        //System.out.println("Numbers in array are:");
        //for (int i = 0; i < numbers.length; i++) {
        //    System.out.print(numbers[i] + " ");
      //  }

    //    sc.close();
  //  }
//}



// Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;

 //public class Arrays {
    //public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        // Ask user for number of names
        //System.out.print("Enter the number of names: ");
        //int n = sc.nextInt();
        //sc.nextLine();  // consume the newline

        //String[] names = new String[n];

        // Input names
        //System.out.println("Enter " + n + " names:");
        //for (int i = 0; i < n; i++) {
          //  names[i] = sc.nextLine();
        //}

        // Output names
        //System.out.println("\nNames entered:");
        //for (String name : names) {
        //    System.out.println(name);
      //  }

    //    sc.close();
  //  }
//}

// Find the maximum & minimum number in an array of integers.

//import java.util.Scanner;

 //class Arrays {
    //public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt(), arr[] = new int[n];
        //for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        //int max = arr[0], min = arr[0];
        //for (int i = 1; i < n; i++) {
            //if (arr[i] > max) max = arr[i];
          //  if (arr[i] < min) min = arr[i];
        //}

      //  System.out.println("Max: " + max + ", Min: " + min);
    //    sc.close();
  //  }
//}



// Take an array of numbers as input and check if it is an array sorted in ascending
// order.
import java.util.Scanner;

class CheckSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        boolean isSorted = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
               break;
            }
        }

        if (isSorted)
            System.out.println("Array is sorted in ascending order.");
        else
            System.out.println("Array is NOT sorted in ascending order.");

        sc.close();
    }
}



// 2 D Arrays

