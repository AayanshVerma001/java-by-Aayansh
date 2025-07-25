
// 1 se 5 tk print kre
//public class ForLoop {
        //public static void main(String[] args) {
          //  for (int i = 1; i <= 5; i++) {
        //        System.out.println(i);
      //      }
     //   }
    //}
// 5 se 1 tk print kre
//public class ForLoop {
  //  public static void main(String[] args) {
    //    for (int i = 5; i <= 1; i++) {
      //      System.out.println(i);
        //}
    //}
//}

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}