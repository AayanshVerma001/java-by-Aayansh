import java.util.ArrayList;

 class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);

        System.out.println("All numbers: " + nums);
        System.out.println("First element: " + nums.get(0));

        nums.set(1, 25);  // Change 20 to 25
        System.out.println("Updated list: " + nums);

        nums.remove(2);   // Remove element at index 2
        System.out.println("After removal: " + nums);

        System.out.println("Size: " + nums.size());
    }
}