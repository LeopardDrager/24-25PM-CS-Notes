import java.util.Scanner;

public class RPSZombies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Zombie-Human-Snake!");
        
        int userScore = 0, computerScore = 0, ties = 0;
        String playAgain = "Y"; // Initialize to ensure the loop runs at least once
        int round = 0;

        while (playAgain.equalsIgnoreCase("Y")) {
            round++;
            System.out.println("\nRun " + round + ":");
            
            // Prompt user for input
            System.out.print("Pick an option (Z, H, S): ");
            String userChoice = scanner.next();
            
            // Computer's choice alternates based on round number
            String[] computerChoices = {"Z", "H", "S"};
            String computerChoice = computerChoices[(round - 1) % 3];
            System.out.println("Computer chooses: " + computerChoice);

            // Determine winner
            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a Tie!");
                ties++;
            } else if ((userChoice.equalsIgnoreCase("h") && computerChoice.equals("Z"))||
                       (userChoice.equalsIgnoreCase("s") && computerChoice.equals("H")) ||
                       (userChoice.equalsIgnoreCase("z") && computerChoice.equals("S"))) {
                System.out.println("User Wins!!");
                userScore++;
            } else {
                System.out.println("Computer Wins!!");
                computerScore++;
            }

            // Print scoreboard
            System.out.println("\nScoreboard:");
            System.out.println("----------------------------");
            System.out.println("User: " + userScore);
            System.out.println("Computer: " + computerScore);
            System.out.println("Ties: " + ties);

            // Ask to play again
            System.out.print("\nDo you wish to play again (Y/N)? ");
            playAgain = scanner.next();
        }

        System.out.println("Thanks for playing Zombie, Human, and Snake!");
        scanner.close();
    }
}
