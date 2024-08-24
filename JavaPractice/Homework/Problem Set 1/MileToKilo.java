import java.util.Scanner;


public class MileToKilo {



    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);

        System.out.print("Please input a mile you would like to be converted to a kilometer! "); // Finding out the mile
        double mile = ui.nextDouble();

        double kilometer = (mile * 1.6); // Created a varible for the equation as it makes it easier to view the code and know whats going on.
        System.out.print("That's " + kilometer + " in kilometers" );
        ui.close();
    }

}