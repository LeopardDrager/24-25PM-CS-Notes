import java.util.Scanner;


public class HospitalReport {


    static void equalSighns() { // This is bascially as far as my java knowledge goes it functions and for loops, thats as far as I've gotten in robotics
        System.out.print("=");
        
    }

    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);
        
        System.out.print("Please enter your first name: "); // Asking for first name storing
        String firstName = ui.nextLine();

        System.out.print("Please enter your last name: "); // Asking for last name storing
        String lastName = ui.nextLine();

        System.out.print("Please enter your address: "); // Asking for address storing
        String address = ui.nextLine();

        System.out.print("Please enter your city: "); // Asking for city storing
        String city = ui.nextLine();

        System.out.print("Please enter your state: "); // Asking for state then storing
        String state = ui.nextLine();

        System.out.print("Please enter your zip code: "); // Asking for zip then storing
        String zip = ui.nextLine();

        System.out.print("Please enter your payment owed: "); // Asking for payment owed then storing
        String paymentOwed = ui.nextLine();

        System.out.print("Please enter your payment ammount: "); // Asking for payment ammount then storing
        String paymentAmmount = ui.nextLine();

        System.out.print("Please enter your payment date: "); // Asking for payment date then storing
        String paymentDate = ui.nextLine();

        System.out.println("\t\t\t\t\t\t\t"+ city + " Hospital"); // made it so hospital has the same name as the city
        
        for (int i = 0; i < 102; i++){ // this will make an equal sign up until it would spill over on my terminal size
            equalSighns();
        }

        System.out.println("\n\n\t" + "Name" + "\t\t Address " + "\t\t\t Payment Information"); // Didn't relize I was making it way to hard on me till afterwards

        System.out.println("\n " + "Last" +"\t" + "First" + "\t" + "AddressLine" + "\t" + "City" + "," + "State" + "\t " + "Zip" + "\t" + "Ammount Owed" + "\t" + "Payment Amount" + "\t" + "Payment Date");


        for (int i = 0; i < 102; i++){
            equalSighns();
        }


        System.out.println("\n\n " + lastName +"\t" + firstName + "\t" + address + "\t" + city + "," + state + "\t " + zip + "\t" +"$" + paymentOwed + "\t" + "$" + paymentAmmount + "\t" + paymentDate);
        
        
        ui.close();

        
    }
}
