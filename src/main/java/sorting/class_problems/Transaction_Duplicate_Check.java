package sorting.class_problems;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] a = {"TXN1001", "TXN1002", "TXN1003",
                      "TXN1002", "TXN1004"};

        HashSet<String> set = new HashSet<>();
        boolean duplicate = false;

        for (String id : a) {
            if (set.contains(id)) {
                duplicate = true;
                break;
            }
            set.add(id);
        }

        System.out.println(duplicate);
    }
}

