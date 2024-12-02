import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Dividebyzero {
    public static int firstNum;
    public static int secondNum;
    public static int i = 0;
    public static boolean running;
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please give me a number");
        firstNum = input.nextInt();
        System.out.println("Please give me another number");
        secondNum = input.nextInt();
        
        running = true;
        while (running){
            statements(input);
            }
    }
    public static void statements(Scanner input){
        if (secondNum == 0 && i == 0){
            System.out.println("You can't divide by 0, give me a different number");
            secondNum = input.nextInt();
            i++;
        }else if (secondNum == 0 && i == 1){
            System.out.println("The program will crash if you keep trying");
            secondNum = input.nextInt();
            i++;
        }else if (secondNum == 0 && i == 2){
            System.out.println("Are you trying to crash the program? (y/n)");
            String response = input.next();
            if (response.equalsIgnoreCase("y")){
                System.out.println("You are mean!");
                try {
                    double result = firstNum/secondNum;
                }catch (Exception e){
                    System.out.println("ERROR CANNOT COMPUTE");
                    i++;
                }
            }
        }else if (secondNum == 0 && i == 3){
            System.out.println("Please give me a number");
            secondNum = input.nextInt();
            i++;
        }else if (secondNum == 0 && i == 4){
            System.out.println("Okay tough guy enough");
            i = 0;
        }else {
            double result = ((firstNum*1.00)/(secondNum*1.00));
            System.out.println("Answer: " + result);
            System.exit(0);
        }}
}
