//Print all the permutations of a string ..

 class StringPermutations {

    public static void printPermutations(String str, String result) {
        // Base case
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        // Recursively place each character at first position
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);

            printPermutations(remaining, result + currentChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("All permutations of \"" + str + "\":");
        printPermutations(str, "");
    }
}