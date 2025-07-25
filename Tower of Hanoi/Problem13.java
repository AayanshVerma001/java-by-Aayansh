//Friends pairing problem

 class FriendsPairing {

    public static int countPairings(int n) {
        // Base cases
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }

        // Recursive step
        int single = countPairings(n - 1);             // 1 friend stays single
        int pairUp = (n - 1) * countPairings(n - 2);   // 1 friend pairs up with (n-1) choices

        return single + pairUp;
    }

    public static void main(String[] args) {
        int n = 4;  // Number of friends
        System.out.println("Total ways to pair " + n + " friends: " + countPairings(n));
    }
}