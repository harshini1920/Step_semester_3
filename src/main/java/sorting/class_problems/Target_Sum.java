package sorting.class_problems;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int target = 9;

        HashSet<Integer> set = new HashSet<>();
        boolean found = false;

        for (int x : a) {
            if (set.contains(target - x)) {
                found = true;
                break;
            }
            set.add(x);
        }

        System.out.println(found);
    }
}

