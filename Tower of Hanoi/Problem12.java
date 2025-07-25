//Tiling Program

class TilingProblem {

    public static int countWays(int n) {
        // Base cases
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive relation
        int vertical = countWays(n - 1);    // 1 vertical tile
        int horizontal = countWays(n - 2);  // 2 horizontal tiles

        return vertical + horizontal;
    }

    public static void main(String[] args) {
        int n = 4; // Length of the board
        System.out.println("Number of ways to tile 2 x " + n + " board: " + countWays(n));
    }
}