//Check if an array is sorted (Strictly increasing)

 class SortedArrayCheck {

    public static boolean isSorted(int[] arr, int index) {
        // Base case: if we reach second last element
        if (index == arr.length - 1) {
            return true;
        }

        // If current element is not less than next
        if (arr[index] >= arr[index + 1]) {
            return false;
        }

        // Recursive call
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 4, 6};  // not strictly increasing

        System.out.println("Array 1 is sorted: " + isSorted(arr1, 0)); // true
        System.out.println("Array 2 is sorted: " + isSorted(arr2, 0)); // false
    }
}













