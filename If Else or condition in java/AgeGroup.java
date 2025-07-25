//IF-ELSE IF STATEMENT

//Write a program to divide people into 3 age groups depending upon thei age.
//Age--below 12 =child
//Age--between 12 and 13 =Teenager
//Age--Above 18=adult
import java.util.Scanner;
public class AgeGroup {
    public static void main (String[]args){
        Scanner Sc=new Scanner(System.in);
        int age=Sc.nextInt();
        if(age<=12){
            System.out.println("Child");

        }
        else
            if (age>12 && age<18){
                System.out.println("teenager");
            }else
                System.out.println("adult");
    }
}
