import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors (or -1 to quit):");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // consume invalid input
                continue;
            }
            int userChoice = scanner.nextInt();
            if (userChoice == -1) {
                System.out.println("Thanks for playing!");
                break;
            }
            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }
            int computerChoice = random.nextInt(3);
            String[] choices = {"Rock", "Paper", "Scissors"};
            System.out.println("Computer chose " + choices[computerChoice]);
            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 0 && computerChoice == 2) ||
                       (userChoice == 1 && computerChoice == 0) ||
                       (userChoice == 2 && computerChoice == 1)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }
        scanner.close();
    }
}