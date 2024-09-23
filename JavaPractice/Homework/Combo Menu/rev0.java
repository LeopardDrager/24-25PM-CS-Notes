import java.util.Scanner;

public class rev0 {
    public static void main(String[] args) {
        Scanner ui = new Scanner (System.in);

        System.out.println("Would you like a sandwhich? y/n " ); // asking user if they want a sandwhich in case they don't
        String sandwhichChoice = ui.next();
        if (sandwhichChoice.equalsIgnoreCase("y")){
            System.out.println("The prices are \n 1. Tofu: $5.75 \n 2. Chicken: $5.25 \n 3. Beef: $6.25 \n 4. None of these");
            int toppingChoice = ui.nextInt();   
            if(toppingChoice == 1){            
                System.out.println("\nYou picked tofu! ");
            }else if(toppingChoice == 2){
                System.out.println("\nYou picked chicken! ");
            }else if(toppingChoice == 3) {
                System.out.println("\nYou picked beef! ");
            }else{
                System.out.println("\nYou picked nothing ");
            }

               
        }else{
            System.out.println("I guess you don't want a sandwhich.");
        }

    ui.close();}
    
}
