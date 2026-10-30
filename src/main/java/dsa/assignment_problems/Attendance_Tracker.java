package dsa.assignment_problems;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] days = new int[n];

        int present = 0;
        int current = 0;
        int longest = 0;

        for (int i = 0; i < n; i++) {
            days[i] = sc.nextInt();

            if (days[i] == 1) {
                present++;
                current++;
            } else {
                current = 0;
            }

            if (current > longest) {
                longest = current;
            }
        }

        System.out.println("Present: " + present);
        System.out.println("Longest streak: " + longest);
    }
}
