//TYPES OF Inheritance ::

// 1.Single Inheritance
class A {
    void show() {
        System.out.println("Hello");
    }
}

class B extends A {
}

 class main {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}