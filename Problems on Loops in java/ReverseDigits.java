// Reverse the digits of a number
// (input) 2 3 4 6 =6 4 3 2 (ans)
//                   6*10+6=6
//                   6*10+=64
//                   64*10+3=643
//                   643*10+2=6432

// loop{
// (ans*10+n%10)    // ans=6
//  n/=10
// }

import java.util.Scanner;
public class ReverseDigits {
    public static void main (String[]args){
        Scanner Sc=new Scanner (System.in);
        int n=Sc.nextInt();
        int ans=0;
        while (n>0){
            ans=ans*10+n%10;
            n/=10;
        }
        System.out.println();

    }
}
