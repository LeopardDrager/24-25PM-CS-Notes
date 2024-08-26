import java.util.Scanner;

public class SciFi {
    public static void main(String[] args){
        
        Scanner ui = new Scanner(System.in);

  
        
         System.out.print("What is your first name? ");
         String firstName = ui.nextLine();

         System.out.print("What is your last name? ");
         String lastName = ui.nextLine();

         System.out.print("What is the city you live in? ");
         String city = ui.nextLine();

         System.out.print("What is your school you plan on attending after high school? ");
         String school = ui.nextLine();

         System.out.print("What is your pet? ");
         String pet = ui.nextLine();

         System.out.print("What is your favoirtie siblings name? ");
         String sibName = ui.nextLine();

         System.out.print("\tFirst: " + firstName + "\n\tLast: " + lastName + "\n\tCity: " + city + "\n\tSchool: " + school + "\n\tPet: " + pet + "Sib: " + sibName );

        }
}