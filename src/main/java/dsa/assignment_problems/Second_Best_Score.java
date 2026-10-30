package dsa.assignment_problems;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int highest = -1;
        int second = -1;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > highest) {
                second = highest;
                highest = arr[i];
            } 
            else if (arr[i] < highest && arr[i] > second) {
                second = arr[i];
            }
        }

        System.out.println(second);
    }
}
