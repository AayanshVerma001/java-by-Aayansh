// STRING:: String manipulation is the most common part of many Java Programs.
// String represent a sequence of characters.
// Example: char charArray[]=new char[4];
//          charArray[0]='j';
//          charArray[1]='a';
// Declaration: String name="Tony"

// Talking Input::
// Scanner firstName="Tony";
//         String secondName="Stark;
//         String fullName=firstName+""+secondName;
//         System.out.println(fullName);



//PRINT LENGTH OF A STRING :
//        String firstName="Tony";
//               String secondName="Stark";
//                String fullName=firstName+""+secondName;
//                System.out.println(fullName.length());





// Access Characters of a String:

//String firstName="Tony";
//        String secondName="Stark";
//        String fullName=firstName+""+secondName;
//        for(int i=0; i<fullName.length(); i++){
//        System.out.println(fullName.chart(i));
//         }



//COMPARE 2 STRING ::

import java.util.*;
public class Strings {
    public static void main (String args[]){
        String name1="Tony";
        String name2="Tony";
        if(name1.equals(name2)){
            System.out.println("They are the same String");
        } else {
            System.out.println("They are differnt Srings");
        }
        //DO NOT USE== to check for string equality
        //Give correct answer here
        if(name1==name2){
            System.out.println("They are the same String");
        } else {
            System.out.println("They are different Strings");
        }
        //Gives incorrect answer here
        if (new String("Tony") == new String ("Tony")){
    System.out.println("They are the same String");
        }else {
            System.out.println("They are different Strings");
        }
    }
}
