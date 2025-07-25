//Move all 'x' to the end of the String ..





class MoveAllX {

    public static String moveX(String str, int index, int count, String result) {
        // Base case
        if (index == str.length()) {
            // Add all 'x' at the end
            for (int i = 0; i < count; i++) {
                result += 'x';
            }
            return result;
        }

        char current = str.charAt(index);

        // If current char is 'x', count it
        if (current == 'x') {
            return moveX(str, index + 1, count + 1, result);
        } else {
            result += current; // add to result
            return moveX(str, index + 1, count, result);
        }
    }

    public static void main(String[] args) {
        String str = "axxbcx";
        String result = moveX(str, 0, 0, "");
        System.out.println("After moving all 'x' to end: " + result);
    }
}


