package DSA.class_problems;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] rain = new double[7];
        double total = 0;
        int wettest = 0;
        int dry = 0;

        for (int i = 0; i < 7; i++) {
            rain[i] = sc.nextDouble();
            total += rain[i];

            if (rain[i] > rain[wettest] || i == 0)
                wettest = i;

            if (rain[i] == 0)
                dry++;
        }

        System.out.print("Rainfall (mm): ");

        for (int i = 0; i < 7; i++) {
            System.out.print(rain[i] + " ");
        }

        System.out.println();

        System.out.println("Total Rainfall: " + total + " mm");

        System.out.printf("Average Rainfall: %.2f mm%n", total / 7);

        System.out.println("Wettest Day: Day " + (wettest + 1)
                + " (" + rain[wettest] + " mm)");

        System.out.println("Total Dry Days: " + dry);
    }
}
