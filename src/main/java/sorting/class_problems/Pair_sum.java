package sorting.class_problems;


public class Main {
    public static void main(String[] args) {
        int[] a = {-4, -1, 0, 3, 5, 9};
        int target = 4;

        int left = 0, right = a.length - 1;
        boolean found = false;

        while (left < right) {
            int sum = a[left] + a[right];

            if (sum == target) {
                System.out.println("(" + a[left] + ", " + a[right] + ")");
                found = true;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (!found)
            System.out.println("Not Found");
    }
}

