//Basic Stack Example

//import java.util.Stack;

//public class Main {
   // public static void main(String[] args) {
        //Stack<String> stack = new Stack<>();

        //stack.push("Anshu");
        //stack.push("Aayansh");
  //      stack.push("Vidhant");

    //    System.out.println(stack);  // [Anshu, Aayansh, Vidhant]
  //  }
//}



//Stack POP and PEEK Example

//import java.util.Stack;

//public class Main {
  //  public static void main(String[] args) {
    //    Stack<Integer> nums = new Stack<>();

      //  nums.push(10);
       // nums.push(20);
       // nums.push(30);

      //  System.out.println("Top: " + nums.peek());  // 30
      //  System.out.println("Removed: " + nums.pop());  // 30
      //  System.out.println("Now Top: " + nums.peek());  // 20
   // }
//}





//Stack isEmpty and Search

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();

        st.push("Pen");
        st.push("Book");

        System.out.println("Is stack empty? " + st.isEmpty());  // false
        System.out.println("Search 'Book': " + st.search("Book")); // 1
    }
}