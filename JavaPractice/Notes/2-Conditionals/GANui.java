import java.util.Scanner;
import java.util.Random;

public class GANui {
    public static void main(String[] args){

        Scanner ui = new Scanner(System.in);
       
        //it would be nice to clean our user input... Because we have suspicious users...
        Random generator = new Random();
        
        int numberGenerated = generator.nextInt(0,11);
        //Controller - this is where user input
        System.out.print("Please pick a number from 1-10 ");
        String guess = ui.nextLine();        

        // see if it is an int
        if (guess.contains(".")){
            System.out.println("Only whole numbers please");
        }else if (guess.matches(".*[^0-9]+*")){ // the regex loops through each digit to check if NOT 0-9
            System.out.println("WRONG!");
        }else{
        //It would be nice to clean our user input... Because we have suspicious users... 
        //#1 thing to check for is formatting - ie, is it a whole mumber
        //calculation
        int cleanAns = Integer.parseInt(guess);       //converts / parses a string back to an integer
        if (cleanAns > numberGenerated ){
            System.out.println("The number was smaller than your guess");
        }else if (cleanAns < numberGenerated){
            System.out.println("The number was bigger than your guess");
        }else
            System.out.println("You got it, good job!");

        //View selection where you output to the terminal
    ui.close();}
    }
}

