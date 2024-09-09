import java.util.Scanner;
public class BottlesOf {
        public static void main(String[] args){
          Scanner ui = new Scanner(System.in);
          System.out.println("What is your favorite soda?");
          String soda = ui.nextLine();
          String verse="bottles of";

          for (int i=1; i<100;  i++){       
                ui.nextLine();
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.print(i + " " + verse + " " + soda + " on the wall!");              
          }
        ui.close();}
}
