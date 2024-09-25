import java.util.Scanner;

public class rev0 {
    public static void main(String[] args) {
        
    
        String tempSand = orderSandwhich();
        String tempFries = orderFries();
        System.out.println(tempSand+""+tempFries);

    }


         
    private static String orderSandwhich(){ // asking user if they want a sandwhich in case they don't
        String tempSand ="";
        Scanner ui = new Scanner(System.in);    
        System.out.println("Would you like a sandwhich? y/n " );
        String sandwhichChoice = ui.next();

        if (sandwhichChoice.equalsIgnoreCase("y")){
            
            System.out.println("The prices are \n 1. Tofu: $5.75 \n 2. Chicken: $5.25 \n 3. Beef: $6.25 \n 4. None of these");
            int toppingChoice = ui.nextInt();

            if(toppingChoice == 1){            
                tempSand="tofu sandwhich";
            }else if(toppingChoice == 2){
                tempSand="chicken sandwich";
            }else if(toppingChoice == 3) {
                tempSand="beef sandwhich";
            }
        }else{
            System.out.println("I guess you don't want a sandwhich.");
        }
        return tempSand;
    }
    

    private static String orderFries(){
        String tempFries = "";
        Scanner ui = new Scanner(System.in);
        System.out.println("Would a like some fries? y/n ");
        String fryChoice = ui.next();
        
        if (fryChoice.equalsIgnoreCase("y")){
            System.out.println("The prices are \n 1. Small: $1.00 \n 2. Medium: $1.75 \n 3. Large: $2.25 \n 4. None of these");
            int sizeChoice = ui.nextInt();
                if(sizeChoice == 1){            
                    tempFries = "small fry";
                }else if(sizeChoice == 2){
                    tempFries = "medium fry";
                }else if(sizeChoice == 3) {
                    tempFries = "large fry";
                }
        }else {
            System.out.println("I guess you don't want fries.");
        }
        return tempFries;
        }
}
