//CountPathmaze

class MazePathCount {

    public static int countPaths(int i, int j, int m, int n) {
        // Base case: reached destination
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        // If out of bounds
        if (i >= m || j >= n) {
            return 0;
        }

        // Move down + Move right
        int downPaths = countPaths(i + 1, j, m, n);
        int rightPaths = countPaths(i, j + 1, m, n);

        return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        int m = 3;  // rows
        int n = 3;  // cols

        int totalPaths = countPaths(0, 0, m, n);
        System.out.println("Total unique paths in " + m + "x" + n + " maze: " + totalPaths);
    }
}