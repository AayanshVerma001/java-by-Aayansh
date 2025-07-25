// Declaration:
// type[] arrayName=new type[rows][Columns];
//int[][] numbers=new int[3][5];




//  import java.util.*;
//  public class TwoDArrays {
  //  public static void main(String args[]){
    //    Scanner sc=new Scanner (System.in);
      //  int rows=sc.nextInt();
        // int cols=sc.nextInt();
        // int[][] numbers=new int[rows][cols];
        //input
        //rows
        //  for(int i=0; i<rows; i++)
        // {
            //columns
          //  for(int j=0; j<cols; j++){
            //    numbers[i][j]=sc.nextInt();
          //  }
        // }
      //  for(int i=0; i<rows; i++)
     //   {
      //      for(int j=0; j<cols; j++){
        //        System.out.print(numbers[i][j]+"");

          //  }
         //   System.out.println();
       // }
   // }
//}

//Problems:

//Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs



import java.util.Scanner;

    //   public class TwoDArrays {
  //  public static void main(String[] args) {
     //   Scanner sc = new Scanner(System.in);

        // Input rows and columns
      //  System.out.print("Enter number of rows: ");
       // int rows = sc.nextInt();

     //   System.out.print("Enter number of columns: ");
      //  int cols = sc.nextInt();

        //
        //
        // int[][] matrix = new int[rows][cols];

        // Input matrix elements
      //  System.out.println("Enter matrix elements:");
       // for (int i = 0; i < rows; i++) {
         //   for (int j = 0; j < cols; j++) {
           //     matrix[i][j] = sc.nextInt();
         //   }
       // }

        // Input the number to search
     //   System.out.print("Enter number to search: ");
      //  int x = sc.nextInt();

        //Search for x and print indices
       // boolean found = false;
       // System.out.println("Indices where " + x + " is found:");
        //for (int i = 0; i < rows; i++) {
            //for (int j = 0; j < cols; j++) {
                //if (matrix[i][j] == x) {
                //    System.out.println("(" + i + ", " + j + ")");
              //      found = true;
            //    }
          //  }
        //}

       // if (!found) {
        //    System.out.println(x + " not found in the matrix.");
      //  }

    //    sc.close();
  //  }
//}


//Print the spiral order matrix as output for a given matrix of numbers.

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral order of matrix:");
        printSpiral(matrix, rows, cols);

        sc.close();
    }

    // Method to print spiral order of a matrix
    public static void printSpiral(int[][] matrix, int rows, int cols) {
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            // Print top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Print right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Print bottom row if any
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Print left column if any
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }

        System.out.println();
    }
}
