package sorting.class_problems;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("E245", "Finance");
        map.put("E110", "Engineering");
        map.put("E390", "Marketing");
        map.put("E101", "Engineering");

        System.out.println(map.getOrDefault("E390", "Unknown"));
        System.out.println(map.getOrDefault("E999", "Unknown"));
    }
}

