//Given 2 numbers a & b . Find a raise to the power b.
// a=2  b=5
// b times
// ans=ans*a
import java.util.Scanner;
public class RaisePower {
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt() ,  b=Sc.nextInt();
        int ans=1;
        for(int i=1; i<=b; i++){
            ans*=0;
        }
        System.out.println(ans);
    }
}
