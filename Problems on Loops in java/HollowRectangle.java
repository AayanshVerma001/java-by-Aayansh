        //1 1 1 1 1
        //1       1
        //1       1
        //1       1
        //1 1 1 1 1


         class HollowNumberRectangle {
            public static void main(String[] args) {
                int rows = 5, cols = 5;

                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= cols; j++) {
                        if (i == 1 || i == rows || j == 1 || j == cols) {
                            System.out.print("1 ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
            }
        }