//Compile-Time polymorphism

class Calculator {

    // Method with 2 int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with 3 int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with 2 double parameters
    double add(double a, double b) {
        return a + b;
    }
}

class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 integers: " + calc.add(5, 10));         // Calls int add(int, int)
        System.out.println("Sum of 3 integers: " + calc.add(1, 2, 3));       // Calls int add(int, int, int)
        System.out.println("Sum of 2 doubles: " + calc.add(4.5, 5.5));       // Calls double add(double, double)
    }
}