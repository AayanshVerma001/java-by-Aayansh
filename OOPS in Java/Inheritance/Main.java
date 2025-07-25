//Multilevel inheritance

class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class SportsCar extends Car {
    void boost() {
        System.out.println("SportsCar boosts speed");
    }
}

class Main {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.start();   // from Vehicle
        sc.drive();   // from Car
        sc.boost();   // from SportsCar
    }
}
