//Basic Hashmap Example

//import java.util.HashMap;

//class Main {
    //public static void main(String[] args) {
        //HashMap<Integer, String> map = new HashMap<>();

       // map.put(1, "Anshu");
      //  map.put(2, "Aayansh");
      //  map.put(3, "Vidhant");

    //    System.out.println(map);  // {1=Anshu, 2=Aayansh, 3=Vidhant}
  //  }
//}





//Example :: Get , Remove and Iterate

import java.util.*;

class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Anshu", 90);
        marks.put("Aayansh", 85);
        marks.put("Vidhant", 88);

        System.out.println("Anshu's Marks: " + marks.get("Anshu")); // 90

        marks.remove("Aayansh");

        // Loop through map
        for (String name : marks.keySet()) {
            System.out.println(name + ": " + marks.get(name));
        }
    }
}