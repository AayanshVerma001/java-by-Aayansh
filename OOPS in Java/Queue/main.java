//Queue using LinkedList (Most Common)

//import java.util.*;

 //class Main {
   // public static void main(String[] args) {
        //Queue<String> queue = new LinkedList<>();

      //  queue.add("Anshu");
      //  queue.add("Aayansh");
      //  queue.add("Vidhant");

    //    System.out.println(queue);  // [Anshu, Aayansh, Vidhant]
  //  }
//}



//Remove and peek

//import java.util.*;

 //class Main {
    //public static void main(String[] args) {
        //Queue<Integer> q = new LinkedList<>();

        //q.add(10);
        //q.add(20);
        //q.add(30);

        //System.out.println("Head: " + q.peek());   // 10
      //  System.out.println("Removed: " + q.remove());  // 10
    //    System.out.println("Now: " + q);           // [20, 30]
  //  }
//}




//Using offer() and and poll()

import java.util.*;

class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Pen");
        queue.offer("Book");

        System.out.println(queue.poll());  // Pen
        System.out.println(queue.peek());  // Book
    }
}