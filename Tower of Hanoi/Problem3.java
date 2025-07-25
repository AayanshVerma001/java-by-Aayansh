//Find the occurrence of the first and last occurrence of an element using recursion..



class FirstLastOccurrence {

    static int first = -1;
    static int last = -1;

    public static void findOccurrences(int[] arr, int index, int key) {
        // Base case
        if (index == arr.length) {
            return;
        }

        // If match found
        if (arr[index] == key) {
            if (first == -1) {
                first = index;
            }
            last = index; // keep updating for last
        }

        // Recursive call
        findOccurrences(arr, index + 1, key);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 5, 4, 5, 6};
        int key = 5;

        findOccurrences(arr, 0, key);

        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
    }
}