import java.util.InputMismatchException;
import java.util.Scanner;

public class Execeptions{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueRunning = true;

        // Main loop for showcasing exceptions
        while (continueRunning) {
            // Display the menu of options
            System.out.println("\nSelect an exception to showcase:");
            System.out.println("1. ArithmeticException");
            System.out.println("2. ArrayIndexOutOfBoundsException");
            System.out.println("3. NullPointerException");
            System.out.println("4. NumberFormatException");
            System.out.println("5. IllegalArgumentException");
            System.out.println("6. RuntimeException");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");

            int choice = scanner.nextInt();

            // Handle the user's choice using a switch-case statement
            switch (choice) {
                case 1:
                    handleArithmeticException(scanner);
                    break;
                case 2:
                    // handleArrayIndexOutOfBounds(scanner);
                    break;
                case 3:
                    handleNullPointerException();
                    break;
                case 4:
                    handleNumberFormatException(scanner);
                    break;
                case 5:
                    // handleIllegalArgumentException(scanner);
                    break;
                case 6:
                    // handleRuntimeException(scanner);
                    break;
                case 7:
                    System.out.println("Exiting the program. Goodbye!");
                    continueRunning = false;  // Exit the loop and end the program
                    break;
                default:
                    System.out.println("Invalid choice, please select a number between 1 and 7.");
            }
        }

        scanner.close();
    }
    private static void handleArithmeticException(Scanner scanner){
        //stop the divide by 0 errors
        //try to do this
        try {
            System.out.println("Two numbers please");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            double result = (num1*1.00)/(num2*1.00);
            System.out.println("Results: " + result);
        }
        //if error catch the program from breaking 
        catch(ArithmeticException e){       //catch if /0 error
            System.err.println(e);
        }catch(NumberFormatException e){    //catch if wrong data type
            System.err.println(e + "integers only");    
        }
        
    }
    
    private static void handleNumberFormatException(Scanner scanner){
        // try this
        try{
            System.out.println("Enter a number: ");
            String ui = scanner.next();
            
            //try to convert to an integer
            int number = Integer.parseInt(ui);
            System.out.println("Your number is " + number);

        }catch(NumberFormatException e){
            System.err.println(e);
        }catch(InputMismatchException e){
            System.err.println(e);
        }catch(Exception e){
            //Generic exception, may not be as detailed as the others
            System.err.println(e);
        }

        //catch the NumberFormat Issue
    }

    private static void handleNullPointerException(Scanner scanner){
        try{    
            String name = null;

            System.out.println("How long the name is " + name.length());


        }catch(NullPointerException e){
            System.err.println(e);
            System.out.println("You are attempting to make something that doesn't exist do something...");

        }
        
    }
}