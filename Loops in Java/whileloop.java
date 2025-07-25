//Types of loops
// #while loop
// #for loop
// #do-while loop

// while loop
// while(condition) {
// code
 // }

// Print the sum of the first n natural numbers where n is the input.
import java.util.Scanner;
//print 1 to n
//public class whileloop {
    //public static void main (String[]args){
        //Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        //int num=1;
        //while(num<=1){
      //      System.out.println(num);
    //        num++; //increment operator ++ , num=num+1
  //      }
 //   }
//}


//Print the sum of the first n natural numbers,where n is the input.

import java.util.Scanner;
//print 1 to n
class WhileLoop {
    public static void main (String[]args){
        Scanner Sc=new Scanner (System.in);
        int n=Sc.nextInt();
        int sum=0;
        int num=1;
        while (num<=n){
            //System.out.println(num);
            sum=sum+num;
            num++; //increment Operator ++ , num=num+1
        }
        System.out.println(sum);
    }
}