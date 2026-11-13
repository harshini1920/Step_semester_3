package sorting.assignment_problems;

public class Main {
    public static void main(String[] args) {
        int[] a = {30, 10, 40, 20};

        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = key;

            System.out.print("After placing " + key + ": ");
            for (int x : a)
                System.out.print(x + " ");

            System.out.println();
        }
    }
}

