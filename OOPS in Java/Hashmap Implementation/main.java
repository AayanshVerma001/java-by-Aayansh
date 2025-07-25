public class main {
    public class Main {
        public static void main(String[] args) {
            MyHashMap map = new MyHashMap();

            map.put(1, 100);
            map.put(2, 200);
            map.put(12, 300); // Will go to same bucket as 2

            System.out.println("Get 1: " + map.get(1));  // 100
            System.out.println("Get 12: " + map.get(12));  // 300

            map.remove(2);
            System.out.println("Get 2: " + map.get(2));  // -1 (not found)
        }
    }
}
