//Run-Time Polymorphism

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class main  {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();  // upcasting
        a.sound();      // Dog's sound() will be called

        a = new Cat();  // upcasting
        a.sound();      // Cat's sound() will be called
    }
}