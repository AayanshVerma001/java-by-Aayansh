public class GreatestOfThree {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;
        if(a >= b && a >= c)
            System.out.println("Greatest: " + a);
        else if(b >= c)
            System.out.println("Greatest: " + b);
        else
            System.out.println("Greatest: " + c);
    }
}