//1       2
  //      3   4   5   6
    //    7       8       9



 class ZigZagNumberPattern {
    public static void main(String[] args) {
        int rows = 3;
        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 9; j++) {
                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0)) {
                    System.out.print(number++ + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

