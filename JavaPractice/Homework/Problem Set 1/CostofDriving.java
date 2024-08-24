import java.util.Scanner;


public class CostofDriving {

    public static void main(String[] args){
        
        Scanner ui = new Scanner(System.in);
        
        System.out.print("Please enter the distance of the trip. (in miles) "); // Finding out distance of trip from user
        double distanceOfTrip = ui.nextDouble();
        
        System.out.print("Please enter your car's miles per gallon. "); // Finding out user's car mpg
        double carMPG = ui.nextDouble();

        System.out.print("Please enter the cost of gas per gallon. "); // Finding out cost of per gallon from user
        double pricePG = ui.nextDouble();
        
        
        double gallonsNeeded = distanceOfTrip/carMPG; // Doing math to find out amount of gas needed
        double finalPrice = gallonsNeeded * pricePG; // Doing the final math to get the price
        
        System.out.printf("The cost of gas will be $%.2f%n", + finalPrice); // Pretty it up
    }

    
}
