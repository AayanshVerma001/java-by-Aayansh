//Print keypad combination



 class KeypadCombination {

    // Mapping for digits 0-9
    static String[] keypad = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };

    public static void printCombinations(String digits, int index, String current) {
        // Base case
        if (index == digits.length()) {
            System.out.println(current);
            return;
        }

        char digitChar = digits.charAt(index);
        int digit = digitChar - '0'; // Convert char to int

        String letters = keypad[digit];

        for (int i = 0; i < letters.length(); i++) {
            printCombinations(digits, index + 1, current + letters.charAt(i));
        }
    }

    public static void main(String[] args) {
        String input = "23";
        System.out.println("Keypad combinations for \"" + input + "\":");
        printCombinations(input, 0, "");
    }
}