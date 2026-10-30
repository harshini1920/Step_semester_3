package dsa.assignment_problems;
import java.util.Scanner;

class Main {

    static int lowerBound(int[] arr, int n, int low) {
        int start = 0, end = n;

        while (start < end) {
            int mid = (start + end) / 2;

            if (arr[mid] < low) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int upperBound(int[] arr, int n, int high) {
        int start = 0, end = n;

        while (start < end) {
            int mid = (start + end) / 2;

            if (arr[mid] <= high) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int low = sc.nextInt();
        int high = sc.nextInt();

        int count = upperBound(arr, n, high)
                  - lowerBound(arr, n, low);

        System.out.println(count);
    }
}
