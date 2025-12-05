package srujan;
import java.util.Scanner;

public class Cricketmatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Team A score (batting first): ");
        int teamA = scanner.nextInt();

        System.out.print("Enter Team B score (chasing team): ");
        int teamB = scanner.nextInt();

        // Input validation: scores must be non-negative
        if (teamA < 0 || teamB < 0) {
            System.out.println("Error: Scores cannot be negative.");
        }
        // Team B wins: must be exactly teamA + 1
        else if (teamB == teamA + 1) {
            System.out.println("Team B wins.");
        }
        // Team B scored more than needed — impossible in real cricket
        else if (teamB > teamA + 1) {
            System.out.println("Invalid result: Chasing team cannot score more than " + (teamA + 1) + ".");
        }
        // Match tied
        else if (teamB == teamA) {
            System.out.println("Match tied.");
        }
        // Team A wins
        else if (teamB < teamA) {
            System.out.println("Team A wins.");
        }
        // Safety fallback (unlikely with integers)
        else {
            System.out.println("Invalid input.");
        }

        scanner.close();
    }
}