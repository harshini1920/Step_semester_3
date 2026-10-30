pOackage dsa.class_problems;
import java.util.Scanner;

class Student {
    String name;
    int[] marks = new int[3];

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double calculateAverage() {
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            sum = sum + marks[i];
        }

        return sum / 3.0;
    }

    char calculateGrade(double avg) {
        if (avg >= 90) {
            return 'A';
        }
        else if (avg >= 75) {
            return 'B';
        }
        else if (avg >= 60) {
            return 'C';
        }
        else if (avg >= 40) {
            return 'D';
        }
        else {
            return 'F';
        }
    }

    void display() {
        double avg = calculateAverage();
        char grade = calculateGrade(avg);

        System.out.printf("%s: Average %.1f, Grade %c%n",
                name.toUpperCase(), avg, grade);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int[] marks = new int[3];

        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextInt();
        }

        Student s = new Student(name, marks);
        s.display();
    }
}
