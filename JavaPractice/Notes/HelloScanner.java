import java.util.Scanner;

public class HelloScanner {
    public static void main(String[] args) {
        System.out.println("What's for lunch?");
        
        //anytime I need user input... do this...
        Scanner ui = new Scanner(System.in);
        String food = ui.nextLine(); //get the next line of input from user
    
        System.out.println( "Wow! "+food+" sounds Delish!");

        ui.close(); //best practice
    }  

}
