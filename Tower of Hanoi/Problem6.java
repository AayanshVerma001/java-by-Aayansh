//Remove duplicates in a string ..

class RemoveDuplicates {

    // To track visited characters
    static boolean[] map = new boolean[26]; // assuming only lowercase a-z

    public static String removeDuplicates(String str, int index, String newStr) {
        // Base case
        if (index == str.length()) {
            return newStr;
        }

        char currentChar = str.charAt(index);
        if (!map[currentChar - 'a']) {
            newStr += currentChar;         // add to new string
            map[currentChar - 'a'] = true; // mark as visited
        }

        return removeDuplicates(str, index + 1, newStr);
    }

    public static void main(String[] args) {
        String str = "aabbccddeeffgg";
        String result = removeDuplicates(str, 0, "");
        System.out.println("After removing duplicates: " + result);
    }
}