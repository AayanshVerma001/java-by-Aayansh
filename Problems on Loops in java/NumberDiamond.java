        //1
        //1 2
        //1 2 3
        //1 2
        //1

         class NumberDiamond {
            public static void main(String[] args) {
                int n = 3;

                // Upper triangle
                for (int i = 1; i <= n; i++) {
                    for (int s = i; s < n; s++) System.out.print(" ");
                    for (int j = 1; j <= i; j++) System.out.print(j + " ");
                    System.out.println();
                }

                // Lower triangle
                for (int i = n - 1; i >= 1; i--) {
                    for (int s = n; s > i; s--) System.out.print(" ");
                    for (int j = 1; j <= i; j++) System.out.print(j + " ");
                    System.out.println();
                }
            }
        }







