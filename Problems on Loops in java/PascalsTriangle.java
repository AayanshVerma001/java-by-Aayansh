
        //1
        //1   1
        //1   2   1
        //1   3   3   1
        //1   4   6   4   1



        public class PascalsTriangle {
            public static void main(String[] args) {
                int rows = 5;

                for (int i = 0; i < rows; i++) {
                    int number = 1;

                    // Print spaces
                    for (int k = 1; k < rows - i; k++) {
                        System.out.print("  ");
                    }

                    // Print numbers
                    for (int j = 0; j <= i; j++) {
                        System.out.print(number + "   ");
                        number = number * (i - j) / (j + 1);
                    }

                    System.out.println();
                }
            }
        }

