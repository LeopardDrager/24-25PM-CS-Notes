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

        //  System.out.print("\tFirst: " + firstName + "\n\tLast: " + lastName + "\n\tCity: " + city + "\n\tSchool: " + school + "\n\tPet: " + pet + "Sib: " + sibName );

         /*
          * SciFiFirstName = first two letters of FirstName and last two letters of LastName 
          * SciFiLastName = first 4 letters of city and last 3 letters of school
          * SciFiOrigin = first 3 letters of pet and last 2 letter of sibling
          *
          * print out -? Howdy SciFiFirstName SciFiLastName from ScifiOrigin!
          *
          */

        String firstnameEdit = firstName.substring(0,2);
        int lastNameLength = lastName.length();
        String lastNameEdit = lastName.substring(lastNameLength-2,lastNameLength);
        
        String cityEdit = city.substring(0,4);
        int schoolLength = school.length();
        String cityNameEdit = city.substring(schoolLength-3,schoolLength);

        String SciFiFirstName = firstnameEdit + lastNameEdit;
        String SciFiLastName = "j";
        System.out.print(SciFiFirstName);
            


        }
}