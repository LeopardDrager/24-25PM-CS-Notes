import java.util.Scanner;
import java.util.Random;

public class GANV2 {
    public static void main(String[] args){

        Scanner ui = new Scanner(System.in);
       
        Random generator = new Random();
        int numberGenerated = generator.nextInt(0,10);
       
        System.out.print("Please pick a number from 1-10 ");
        int guess = ui.nextInt();

        if (guess > numberGenerated ){
            System.out.println("The number was smaller than your guess");
        }else if (guess < numberGenerated){
            System.out.println("The number was bigger than your guess");
        }else
            System.out.println("You got it, good job!");
    ui.close();}
}
