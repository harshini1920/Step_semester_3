package oop.class_problems;

import java.util.Arrays;

class Candidate implements Comparable<Candidate> {

    private String name;
    private double cgpa;
    private int codingScore;

    // Constructor
    public Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    // CGPA-only eligibility
    static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }

    // CGPA + coding score eligibility
    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }

    // Composite score
    double getCompositeScore() {
        return (cgpa * 10) + codingScore;
    }

    // Compare candidates by composite score
    @Override
    public int compareTo(Candidate other) {

        return Double.compare(
            other.getCompositeScore(),
            this.getCompositeScore()
        );
    }

    public String getName() {
        return name;
    }

    static String shortlistAndRank(Candidate[] candidates) {

        Candidate[] shortlisted = new Candidate[candidates.length];

        int count = 0;

        // Find eligible candidates
        for (Candidate candidate : candidates) {

            if (isEligible(candidate.cgpa) ||
                isEligible(candidate.cgpa, candidate.codingScore)) {

                shortlisted[count] = candidate;
                count++;
            }
        }

        // Create array with exact size
        Candidate[] finalList = Arrays.copyOf(shortlisted, count);

        // Sort using Comparable
        Arrays.sort(finalList);

        String result = "";

        for (int i = 0; i < finalList.length; i++) {

            result = result +
                (i + 1) + ". " +
                finalList[i].name +
                " (" +
                finalList[i].getCompositeScore() +
                ")";

            if (i < finalList.length - 1) {
                result = result + " | ";
            }
        }

        return result;
    }
}

public class PlacementRanking {

    public static void main(String[] args) {

        Candidate[] candidates = {

            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };

        System.out.println(
            Candidate.shortlistAndRank(candidates)
        );
    }
}
