import java.util.Scanner;

public class FinanApp {

    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);

        System.out.print("Please enter the investment amount. " ); // Finding out investment amount
        double investmentAmount = ui.nextDouble();

        System.out.print("Please enter the monthly interest, as a percentage. " ); // Finding out monthly interest rate as a percentage
        double monthlyIntrestRatePercentage = ui.nextDouble();

        System.out.print("Please enter the number of years. " ); // Finding out number of years
        double numberOfYears = ui.nextDouble();

        double power = numberOfYears*12; // Figuring out to which power will monthlyIntrestRatePercentage be put to
        double monthlyIntrestRate = monthlyIntrestRatePercentage/100; // Calculating intrest rate as a decimal
        double everythingExceptFutureValue = Math.pow((1 + monthlyIntrestRate),power); // Doing the to the power math here
        
        double futureValue = investmentAmount * everythingExceptFutureValue; // Final mathing

 
        System.out.printf("Future value is  %.2f%n", + futureValue); // Pretty it up since money is only two decimal places
    }
}
