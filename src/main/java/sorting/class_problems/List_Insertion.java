package sorting.class_problems;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6};
        int target = 2;

        int low = 0, high = a.length - 1;
        int ans = a.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Insert Position = " + ans);
    }
}

