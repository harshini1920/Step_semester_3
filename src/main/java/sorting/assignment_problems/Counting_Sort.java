package sorting.assignment_problems;

public class Main {
    public static void main(String[] args) {
        int[] a = {4, 1, 6, 4, 2, 1, 4};
        int[] count = new int[7];

        for (int x : a) {
            count[x]++;
        }

        System.out.print("Counts: ");

        for (int i = 1; i <= 6; i++) {
            System.out.print(i + ":" + count[i] + " ");
        }

        System.out.println();

        int k = 0;

        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < count[i]; j++) {
                a[k] = i;
                k++;
            }
        }

        System.out.print("Sorted: ");

        for (int x : a)
            System.out.print(x + " ");
    }
}

