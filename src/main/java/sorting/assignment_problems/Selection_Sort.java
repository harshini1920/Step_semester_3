package sorting.assignment_problems;

public class Main {
    public static void main(String[] args) {
        int[] a = {45, 90, 60, 75};
        int swaps = 0;

        for (int i = 0; i < a.length - 1; i++) {
            int max = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[max])
                    max = j;
            }

            if (max != i) {
                int temp = a[i];
                a[i] = a[max];
                a[max] = temp;
                swaps++;
            }
        }

        for (int x : a)
            System.out.print(x + " ");

        System.out.println("\nSwaps = " + swaps);
    }
}

