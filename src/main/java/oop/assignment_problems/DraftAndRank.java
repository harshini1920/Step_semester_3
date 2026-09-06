package oop.assignment_problems;

import java.util.Arrays;

class Player implements Comparable<Player> {

    private String name;
    private int matchesPlayed;
    private double battingAverage;
    private boolean injured;

    // Constructor
    public Player(String name, int matchesPlayed,
                  double battingAverage, boolean injured) {

        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    // Experience-only rule
    static boolean isDraftable(int matchesPlayed) {

        return matchesPlayed >= 10;
    }

    // Matches + fitness rule
    static boolean isDraftable(int matchesPlayed,
                               boolean injured) {

        return matchesPlayed >= 5 && !injured;
    }

    public int compareTo(Player other) {

        return Double.compare(
            other.battingAverage,
            this.battingAverage
        );
    }

    static String draftAndRank(Player[] players) {

        Player[] draftable = new Player[players.length];

        int count = 0;

        // Find draftable players
        for (Player player : players) {

            if (isDraftable(player.matchesPlayed) ||
                isDraftable(player.matchesPlayed, player.injured)) {

                draftable[count] = player;
                count++;
            }
        }

        // Resize array
        Player[] finalList =
                Arrays.copyOf(draftable, count);

        // Sort using Comparable
        Arrays.sort(finalList);

        String result = "";

        for (int i = 0; i < finalList.length; i++) {

            result = result +
                     (i + 1) + ". " +
                     finalList[i].name;

            if (i < finalList.length - 1) {
                result = result + " | ";
            }
        }

        return result;
    }
}

public class FantasyDraft {

    public static void main(String[] args) {

        Player[] players = {

            new Player("Virat", 15, 48.0, false),

            new Player("Rahul", 7, 55.0, false),

            new Player("Sameer", 3, 60.0, false),

            new Player("Dev", 12, 20.0, true)
        };

        System.out.println(
            Player.draftAndRank(players)
        );
    }
}
