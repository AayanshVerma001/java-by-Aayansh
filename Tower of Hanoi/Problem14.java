//Subsets of a set

import java.util.*;

class SubsetOfSet {

    public static void printSubsets(ArrayList<Integer> set, int index, ArrayList<Integer> current) {
        // Base case: reached end of set
        if (index == set.size()) {
            System.out.println(current);
            return;
        }

        // Include current element
        current.add(set.get(index));
        printSubsets(set, index + 1, current);

        // Backtrack → remove last added element
        current.remove(current.size() - 1);

        // Exclude current element
        printSubsets(set, index + 1, current);
    }

    public static void main(String[] args) {
        ArrayList<Integer> set = new ArrayList<>();
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println("All subsets:");
        printSubsets(set, 0, new ArrayList<>());
    }
}