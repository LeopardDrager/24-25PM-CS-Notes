import java.util.Scanner;
import java.util.Random;

public class rockPaperScissors {
    public static void main (String[]args){
        Scanner ui = new Scanner(System.in);
        Random randomComputer = new Random();
        int computerChoiceInt = randomComputer.nextInt(0, 3);
        
        System.out.println("Please pick an option: scissors (0), rock (1), or paper (2)");
        int userChoice = ui.nextInt();
        System.out.println(computerChoiceInt);


        if (computerChoiceInt == 1 && userChoice == 2){
            System.out.println("The computer picked rock, you picked paper. You win!");
        }else if (computerChoiceInt == 2 && userChoice == 1){
            System.out.println("The computer picked paper, you chose rock. The computer wins!");
        }else if (computerChoiceInt == 0 && userChoice == 2){
            System.out.println("The computer picked scissors, you picked paper.The computer wins!");
        }else if (computerChoiceInt == 2 && userChoice == 0){
            System.out.println("The computer picked paper, you picked scissors. You win!");
        }else if (computerChoiceInt == 1 && userChoice == 0){
            System.out.println("The computer picked rock, you picked scissors. The computer wins!");
        }else if (computerChoiceInt == 0 && userChoice == 1){
            System.out.println("The computer picked scissors, you picked rock. You win!");
        }else if (computerChoiceInt == 1 && userChoice == 1){
            System.out.println("The computer picked rock, you picked rock. You tie! Try again! ");
        }else if (computerChoiceInt == 2 && userChoice == 2){
            System.out.println("The computer picked paper, you picked paper. You tie! Try again! ");
        }else if (computerChoiceInt == 0 && userChoice == 0){
            System.out.println("The computer picked scissors, you picked scissors. You tie! Try again!");
        }
    ui.close();}
}
