// What is Array ?
// Collection of similar type of data.
// Data structure which stores a collection of homogenous items.
// Indexing based 0 based
// Contiguous memory allocate

import java.util.Scanner;

class basic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int num : numbers) {
            System.out.println(num);
        }

        sc.close();
    }
}