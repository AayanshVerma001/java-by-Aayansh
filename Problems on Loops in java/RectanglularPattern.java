// #Printing Pattern: Rectangular Pattern
// #Triangular Pattern
// Numerical Rectangular Pattern
// Numerical Triangular Pattern



// Pattern Printing : Rectangular Pattern
// *****
// *****
// *****
import java.util.Scanner;
public class RectanglularPattern {
    public static void main (String[]args){
        Scanner Sc=new Scanner(System.in);
        int r=Sc.nextInt();
        int c=Sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
               System.out.print("*");
            }
            System.out.println();
        }
    }
}
