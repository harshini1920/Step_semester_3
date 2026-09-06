package array.class_problems;

public class RotateArray {

    static int[] rotateArray(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        int[] newArray = new int[n];

        for (int i = 0; i < n; i++) {
            newArray[(i + k) % n] = nums[i];
        }

        return newArray;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        int[] result = rotateArray(nums, k);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
