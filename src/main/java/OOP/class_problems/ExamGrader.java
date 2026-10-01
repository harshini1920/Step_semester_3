package OOP.class_problems;
import java.util.*;

abstract class Question {
    int points;

    Question(int points) {
        this.points = points;
    }

    abstract double grade(String correct, String student);
}

class MCQ extends Question {
    MCQ(int points) {
        super(points);
    }

    double grade(String correct, String student) {
        return student.equals(correct) ? points : 0;
    }
}

class TF extends Question {
    TF(int points) {
        super(points);
    }

    double grade(String correct, String student) {
        return student.equals(correct) ? points : 0;
    }
}

class Essay extends Question {
    Essay(int points) {
        super(points);
    }

    double grade(String correct, String student) {
        String[] keywords = correct.split(",");
        int count = 0;

        student = student.toLowerCase();

        for (String word : keywords) {
            if (student.contains(word.trim().toLowerCase()))
                count++;
        }

        if (count >= 2)
            return points * 0.75;
        if (count == 1)
            return points * 0.50;

        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double total = 0;

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split("\"");

            String type = parts[0].trim();
            String correct = parts[3];
            String student = parts[5];
            int points = Integer.parseInt(parts[6].trim());

            Question q;

            if (type.equals("MCQ"))
                q = new MCQ(points);
            else if (type.equals("TF"))
                q = new TF(points);
            else
                q = new Essay(points);

            double score = q.grade(correct, student);
            total += score;

            System.out.printf("%s: %.2f%n", type, score);
        }

        System.out.printf("Total Score: %.2f%n", total);
    }
}
