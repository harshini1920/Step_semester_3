package sorting.class_problems;

public class Main {
    public static void main(String[] args) {
        int[][] a = {{4, 9, 2}, {7, 1, 6}, {3, 12, 5}};

        int sum = 0, max = a[0][0];
        int row = 0, col = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];

                if (a[i][j] > max) {
                    max = a[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println("Total = " + sum);
        System.out.println("Maximum = " + max);
        System.out.println("Position = (" + row + ", " + col + ")");
    }
}

