package array.assignment_problems;

import java.util.HashMap;

public class SubarraySumK {

    static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Empty prefix
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            sum = sum + nums[i];

            // Check if required previous sum exists
            if (map.containsKey(sum - k)) {
                count = count + map.get(sum - k);
            }

            // Store current prefix sum
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1};
        int k = 2;

        System.out.println(subarraySum(nums, k));
    }
}
