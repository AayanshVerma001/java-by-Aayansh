//Non Parameterized Constructor

//class Student {
  //  // Non-parameterized constructor
   // Student() {
     //   System.out.println("Non-Parameterized Constructor Called");
    //}

    //void showMessage() {
    //    System.out.println("Welcome to Java Constructor Example!");
  //  }
//}

     //class Test {
    //public static void main(String[] args) {
      //  // Creating object, which calls constructor automatically
      //  Student s1 = new Student();
    //    s1.showMessage();
  //  }
//}




//Parameterized  Constructor

//class Student {
    //String name;
    //int age;

  //  // Parameterized constructor
   // Student(String n, int a) {
       // name = n;
     //   age = a;
    //}

    //void display() {
      //  System.out.println("Name: " + name);
    //    System.out.println("Age: " + age);
  //  }
//}

 //class Test {
    //public static void main(String[] args) {
     //   // Passing values while creating the object
      //  Student s1 = new Student("Aayansh", 20);
    //    s1.display();
  //  }
//}



//Copy Constructor

class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Student(Student s) {
        name = s.name;
        age = s.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

 class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Aayansh", 21);  // Original object
        Student s2 = new Student(s1);             // Copying s1 into s2

        s1.display();
        s2.display();
    }
}