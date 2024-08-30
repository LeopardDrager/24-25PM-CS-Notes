import java.util.Scanner;

public class Condish {
    public static void main(String[] args) {
        
        /*
         * if something
         * elif something   else if 
         * else
         */
        int x = 5;

        // At any point 3 or more possible outcomes, use this 
        // There are 3 possible answer 
        if (x==4){
            System.out.println(true);

        }else if (x==8){
            System.out.println("it equals 8");

        }else {
            System.out.println(x); 
            }

        // There are 2 possible answer
        if (x==4){
            System.out.println("they are the same");

        }else {
            System.out.println("they are not the same");
        }

        // There is only one answer 
        if(x==4){
            System.out.println("Do something");
        }
        /*
         * Logical Operator as in logic math as in equalitites 
         * > and < are the greater than and less than 
         * >= <= are the greater than or equal to and the less...
         * .equals() to check if two objects are the same - non-primitive
         * == checks if equal to - for primitive 
         * = one sign is assigning
         * ! this means BANG 
         * != this means not equal - for primitive
         * !hunter.equals(morgan) - for non-primitive
         * 
         */
        // bool y = true;
        // if(y){ //do not do y == true
        //     System.out.println("this means y is true");
        // }else{
        //     System.out.println("this means y is not true");
        // }
        
        /*
         * Compount Conditional Operators
         * and - mean both too the left and right are true
         * or - means only one needs to be true
         */


        // build a conditional statement that if you put in an int, it will tell you the letter grade the student got
        Scanner ui = new Scanner(System.in);
        System.out.println("What percentage did you get?");
        double percentage = ui.nextDouble();
        // clean the data 

        if (percentage >= 90 ){
            System.out.println("You have an A!");
        }else if (percentage >= 80 ){
            System.out.println("You have a B!");
        }else if (percentage >= 70 ){
            System.out.println("You have a C!");   
        }else if (percentage >= 60){
            System.out.println("You have a D.");
        }else{
            System.out.println("You have a F.");
        }

        String masterUsername="hunterThehunter";
        String masterPassword="123456";

        //if not(masterUsername equals hunterTheGather)
        if (!masterUsername.equals("hunterTheGather")){
            System.out.println("The Hunter has arrived with food!");
        }else {
            System.out.println("The Hunter is still hunting!");
        }
        
    }
        

}





