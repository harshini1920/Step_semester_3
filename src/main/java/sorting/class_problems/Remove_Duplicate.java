package sorting.class_problems;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 2, 3, 4, 4, 5};

        int j = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[j]) {
                j++;
                a[j] = a[i];
            }
        }

        System.out.println("Length = " + (j + 1));

        for (int i = 0; i <= j; i++)
            System.out.print(a[i] + " ");
    }
}

