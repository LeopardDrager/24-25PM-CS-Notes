import java.util.Scanner;

public class GANV1 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);        
        System.out.println("Pick a number");        
        double guess = ui.nextDouble();

        if (guess > 7) {
            System.out.println("The value is smaller.");
        }else if (guess < 7){
            System.out.println("The value is bigger.");
        }else {
            System.out.println("You got it, it was 7!");
        }
        

    ui.close();}
}
