package sorting.assignment_problems;

public class Main {
    public static void main(String[] args) {
        int[] a = {3, 5, 5, 8, 6, 9};

        int ans = -1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}

