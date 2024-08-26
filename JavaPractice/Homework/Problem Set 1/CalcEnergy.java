import java.util.Scanner;


public class CalcEnergy {
    

    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);

        System.out.print("Please enter the amount of water in kilograms! " ); // Finding out water weight
        double water = ui.nextDouble();

        System.out.print("Please enter the initial temperature! " ); // Finding out initial temperature
        double initialTemperature = ui.nextDouble();

        System.out.print("Please enter the final temperature! " ); // Finding out final temperature
        double finalTemperature = ui.nextDouble();

        double energy = water * (finalTemperature - initialTemperature) * 4184;

        if (energy > 100000) { // I knew how to do this because I have a little experience in java
            System.out.print("Wow! " + energy  + " is a lot of energy!");
        } 
        else {
            System.out.print("Meh." + energy + " thats not that much energy.");
        }
        ui.close();
    }

}
