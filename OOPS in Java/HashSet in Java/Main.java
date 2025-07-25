//Basic HashSet Example


//import java.util.HashSet;

//public class Main {
    //public static void main(String[] args) {
        //HashSet<String> names = new HashSet<>();

      //  names.add("Anshu");
    //    names.add("Aayansh");
  //      names.add("Vidhant");
//        names.add("Anshu");  // Duplicate - will be ignored

    //    System.out.println(names);
  //  }
//}



//More Example with Integers
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);  // Duplicate

        System.out.println("Set: " + set);       // [10, 20, 30]
        System.out.println("Contains 20? " + set.contains(20));  // true

        set.remove(20);
        System.out.println("After removing 20: " + set); // [10, 30]
    }
}