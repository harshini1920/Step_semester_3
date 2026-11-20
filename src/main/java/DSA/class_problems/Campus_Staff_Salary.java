package DSA.class_problems;
import java.util.*;

class Staff {
    String name;
    double baseSalary;

    Staff(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double getBonus() {
        return 0;
    }

    String getType() {
        return "Staff";
    }
}

class Teacher extends Staff {
    Teacher(String name, double salary) {
        super(name, salary);
    }

    double getBonus() {
        return 5000;
    }

    String getType() {
        return "Teacher";
    }
}

class LabAssistant extends Staff {
    LabAssistant(String name, double salary) {
        super(name, salary);
    }

    double getBonus() {
        return 2000;
    }

    String getType() {
        return "LabAssistant";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Staff[] s = new Staff[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            double salary = sc.nextDouble();

            if (type.equals("Teacher"))
                s[i] = new Teacher(name, salary);
            else if (type.equals("LabAssistant"))
                s[i] = new LabAssistant(name, salary);
            else
                s[i] = new Staff(name, salary);
        }

        double grandTotal = 0;

        for (int i = 0; i < n; i++) {
            double bonus = s[i].getBonus();
            double total = s[i].baseSalary + bonus;

            System.out.println(s[i].name + " (" + s[i].getType()
                    + "): base " + s[i].baseSalary
                    + ", bonus " + bonus + ", total " + total);

            grandTotal += total;
        }

        System.out.println("Grand Total Salary: " + grandTotal);
    }
}
