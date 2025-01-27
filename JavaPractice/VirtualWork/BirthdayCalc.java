import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;//had to google these 3
import java.util.Scanner;


public class BirthdayCalc{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for their birthday
        System.out.println("Enter your birthday (MM-dd-yyyy): EXACTLY like this format ");
        String input = scanner.nextLine();

        // Parse the birthday input
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate birthday = LocalDate.parse(input, formatter);

        // Get the current date
        LocalDate now = LocalDate.now();

        // Calculate the number of days the person has been alive
        long daysAlive = ChronoUnit.DAYS.between(birthday, now);

        // Convert days to seconds
        long secondsAlive = daysAlive * 24 * 60 * 60;

        // Output the result
        System.out.println("You have been alive for approximately " + secondsAlive + " seconds.");

        scanner.close();
    }
}