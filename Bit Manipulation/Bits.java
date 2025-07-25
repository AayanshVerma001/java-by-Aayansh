//Bit Manipulation is the act of algorithmically manipulating bits or binary digits
// (0 and 1) within an integer or data type using bitwise operators. It is used for performance
// optimization, encryption, graphics, and low-level device control.

//GET BIT::

//import java.util.*;
//public class Bits {
    //public static void main (String args[]){
        //int n=5; // 0101
        //int pos=3;
        //int bitMask=1<<pos;
        //if((bitMask &n)==0){
        //    System.out.println("bit was zero");

      //  } else {
    //        System.out.println("bit was one");
  //      }
 //   }
//}




//SEt BIT::


//import java.util.*;
//public class Bits {
   // public static void main (String args[]){
      //  int n=5;//0101
      //  int pos=1;
      //  int bitMask=1<<pos;
      //  int newNumber=bitMask/n;
    //    System.out.println(newNumber);
  //  }
//}





//CLEAR BIT::

//import java.util.*;
//public class Bits {
   // public static void main(String args[]){
      //  int n=5; //0101
       // int pos=2;
       // int bitMask=1<<pos;
       // int newBitMask=~(bitMask);
     //   int newNumber=newBitMask &n;
   //     System.out.println(newNumber);
 //   }
//}




//UPDATE BIT::

import java.util.*;
public class Bits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        //oper=1-> set; oper=0-> clear
        int n=5;
        int pos=1;
        int bitMask=1<<pos;
        if(oper==1){
            //set
            int newNumber=bitMask /n;
            System.out.println(newNumber);
        } else {
            //clear
            int newBitMask=~(bitMask);
            int newNumber=newBitMask &n;
            System.out.println(newNumber);
        }
    }
}