// Count the number of digits for a given number n.
// n=1 2 3 4 5 6
//import java.util.Scanner;
//public class CountDigits {
   // public static void main(String[]args){
     //   Scanner Sc=new Scanner (System.in);
    //int n=Sc.nextInt();
    //int numOfDigits=0;
    //while(n>0){
      //  n=n/10;
        //numOfDigits ++;// numOfDigits = numOfDigits+1
    //}
//System.out.println("Number of digits in "+n+"="+numOfDigits);
  //  }

//}


//Find the sum of digits in a given number n.
// 765=7+6+5=18
// ans= 7+6=13+15
// 765%10=5
// 76%10=6
// 7%10=7
//(Any num)%10=Last digit of num
// 765%10=5
// 76%10=6

import java.util.Scanner;
public class CountDigits{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int sumOfDigits=0;
        int Original_n=n;
        while(n>0){
            sumOfDigits +=n%10;
            n=n/10;
        }
        System.out.println("sUm of digits in "+ Original_n+"="+sumOfDigits);
    }
}