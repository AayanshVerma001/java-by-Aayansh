//Print all unique subsequences of a string ....

import java.util.HashSet;

 class UniqueSubsequences {

    static HashSet<String> set = new HashSet<>();

    public static void printUniqueSubsequences(String str, int index, String current) {
        // Base case
        if (index == str.length()) {
            if (!set.contains(current)) {
                System.out.println(current);
                set.add(current);
            }
            return;
        }

        char currentChar = str.charAt(index);

        // Include the current character
        printUniqueSubsequences(str, index + 1, current + currentChar);

        // Exclude the current character
        printUniqueSubsequences(str, index + 1, current);
    }

    public static void main(String[] args) {
        String str = "aab";
        System.out.println("Unique subsequences of \"" + str + "\":");
        printUniqueSubsequences(str, 0, "");
    }
}