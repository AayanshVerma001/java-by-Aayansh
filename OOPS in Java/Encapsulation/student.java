//Example of Encapsulation


class Student {
    private String name;  // private data
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String n) {
        name = n;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int a) {
        if(a > 0) {
            age = a;
        }
    }
}

 class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Aayansh");
        s.setAge(17);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}