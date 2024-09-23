import java.util.Scanner;

public class rev0 {
    public static void main(String[] args) {
        int condition = 3; // declaring now for later
        Scanner ui = new Scanner (System.in);

        System.out.println("Would you like a sandwhich? y/n " ); // asking user if they want a sandwhich in case they don't
        String sandwhichChoice = ui.next();
        if (sandwhichChoice.equals("y") || sandwhichChoice.equals("Y")){
            System.out.println("The prices are \n 1. Tofu: $5.75 \n 2. Chicken: $5.25 \n 3. Beef: $6.25 \n 4. None of these");
            int toppingChoice = ui.nextInt();
            if(toppingChoice > condition ){
                System.out.println("You got ");

            }    
        }else{
            System.out.println("I guess you don't want a sandwhich.");
        }

    ui.close();}
    
}
