package OOP.class_problems;
import java.util.*;

abstract class Delivery {
    double weight;
    double distance;

    Delivery(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }

    abstract double calculate();
}

class Standard extends Delivery {
    Standard(double weight, double distance) {
        super(weight, distance);
    }

    double calculate() {
        return 5 + 0.5 * weight + 0.1 * distance;
    }
}

class Express extends Delivery {
    Express(double weight, double distance) {
        super(weight, distance);
    }

    double calculate() {
        return 15 + weight + 0.2 * distance;
    }
}

class International extends Delivery {
    double customs;

    International(double weight, double distance, double customs) {
        super(weight, distance);
        this.customs = customs;
    }

    double calculate() {
        return 25 + 2 * weight + 0.5 * distance + customs;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double weight = sc.nextDouble();
            double distance = sc.nextDouble();

            Delivery d;

            if (type.equals("STANDARD"))
                d = new Standard(weight, distance);
            else if (type.equals("EXPRESS"))
                d = new Express(weight, distance);
            else {
                double customs = sc.nextDouble();
                d = new International(weight, distance, customs);
            }

            double fee = d.calculate();
            total += fee;

            System.out.printf("%s: %.2f%n", type, fee);
        }

        System.out.printf("Total: %.2f%n", total);
    }
}
