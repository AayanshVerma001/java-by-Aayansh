//Basic LL example
//import java.util.LinkedList;

 //class Main {
   // public static void main(String[] args) {
       // LinkedList<String> names = new LinkedList<>();

       // names.add("Anshu");
      //  names.add("Aayansh");
      //  names.add("Vidhant");

    //    System.out.println(names);  // Output: [Anshu, Aayansh, Vidhant]
  //  }
//}


//Adding First and Last Elements

//import java.util.LinkedList;

 //class Main {
   // public static void main(String[] args) {
     //   LinkedList<Integer> nums = new LinkedList<>();

       // nums.add(20);
       // nums.addFirst(10);
        //nums.addLast(30);

       // System.out.println("List: " + nums);  // [10, 20, 30]
   // }
//}




//Removing Elements from LL

import java.util.LinkedList;

 class Main {
    public static void main(String[] args) {
        LinkedList<String> items = new LinkedList<>();

        items.add("Pen");
        items.add("Book");
        items.add("Notebook");

        items.removeFirst();  // Removes "Pen"
        items.removeLast();   // Removes "Notebook"

        System.out.println("Remaining: " + items);  // [Book]
    }
}