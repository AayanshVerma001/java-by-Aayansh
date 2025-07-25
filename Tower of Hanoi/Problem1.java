//Tower of hanoi- Transfer n disks from source to destination over 3 n to class TowerOfHanoi {

 class TowerOfHanoi {

    // Recursive method to solve Tower of Hanoi
    public void solve(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: Move n-1 disks from source to auxiliary
        solve(n - 1, source, destination, auxiliary);

        // Step 2: Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: Move n-1 disks from auxiliary to destination
        solve(n - 1, auxiliary, source, destination);
    }

    // Main method to run the program
    public static void main(String[] args) {
        TowerOfHanoi hanoi = new TowerOfHanoi();
        int n = 3;  // Number of disks
        hanoi.solve(n, 'A', 'B', 'C');  // A = source, B = auxiliary, C = destination
    }
}