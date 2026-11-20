package DSA.class_problems;
import java.util.*;

interface PaymentMode {
    double processPayment(double amount);
}

class CashPayment implements PaymentMode {
    public double processPayment(double amount) {
        return amount;
    }
}

class CardPayment implements PaymentMode {
    public double processPayment(double amount) {
        return amount + amount * 0.02;
    }
}

class UpiPayment implements PaymentMode {
    public double processPayment(double amount) {
        return amount;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PaymentMode[] p = new PaymentMode[n];
        String[] mode = new String[n];
        double[] amount = new double[n];

        for (int i = 0; i < n; i++) {
            mode[i] = sc.next();
            amount[i] = sc.nextDouble();

            if (mode[i].equals("Cash"))
                p[i] = new CashPayment();
            else if (mode[i].equals("Card"))
                p[i] = new CardPayment();
            else
                p[i] = new UpiPayment();
        }

        double total = 0;

        for (int i = 0; i < n; i++) {
            double processed = p[i].processPayment(amount[i]);
            double fee = processed - amount[i];

            System.out.println(mode[i] + ": amount " + amount[i]
                    + ", fee " + fee + ", processed " + processed);

            total += processed;
        }

        System.out.println("Total Amount Processed: " + total);
    }
}
