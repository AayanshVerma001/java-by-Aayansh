//Print all the subsequences  of a string..

class PrintSubsequences {

    // Recursive method
    public static void printSubsequences(String str, int index, String current) {
        // Base case: if index reaches end of string
        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        char currentChar = str.charAt(index);

        // Include the current character
        printSubsequences(str, index + 1, current + currentChar);

        // Exclude the current character
        printSubsequences(str, index + 1, current);
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("All subsequences of \"" + str + "\":");
        printSubsequences(str, 0, "");
    }
}