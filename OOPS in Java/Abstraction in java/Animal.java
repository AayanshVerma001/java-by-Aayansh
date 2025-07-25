// 1.Using Abstract Class

//abstract class Animal {
    //abstract void sound();  // abstract method (no body)
    //void eat() {
  //      System.out.println("Eating...");
  //  }
//}

//class Dog extends Animal {
    //void sound() {
    //    System.out.println("Dog barks");
  //  }
//}

//class Main {
    //public static void main(String[] args) {
        //Animal a = new Dog(); // Upcasting
      //  a.sound();  // Only essential details
    //    a.eat();
  //  }
//}


// 2.Using Interface(Full abstraction)

interface Animal {
    void sound();  // abstract by default
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

 class Main {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.sound();
    }
}