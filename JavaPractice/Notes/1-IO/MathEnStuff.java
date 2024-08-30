import java.util.Scanner;

public class MathEnStuff {
    public static void main(String[] args) {
        
        //Build a program that takes in users hourly rate
        //      then outputs the yearly salary 

        Scanner ui = new Scanner(System.in);
        System.out.print("What is your hourly rate? ");
        double rate = ui.nextDouble();
        double income = rate * 2000;
        System.out.printf("You make: $%.2f%n ", + income);

        ui.close();
        





        /*
         * Primitive and Non-Primitive Data Type 
         *      Primitve = Characters, Boolean, Integers, Double
         *      Non-Primitive = Strings, Arrays, ArrayList, List, Objects in general
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         */


         double money = 3.99;
         Double momoney = 3.99; // DO NOT USE THIS METHOD TO CREATE A double OBJ

         int x = 4;
         Integer y = 5; //DO NOT USE THIS METHOD TO CREATE A int OBJ

        //Math Shortcuts
        //python increase by 1-> x+=1
        x++;    //this adds 1
        y--;    //this subs 1
        x+=2;   //this adds 2
        x-=2;   //this subs 2
        x/=2;   //this divs 2
        x*=2;    //this multiplys 2

        //python exponents you could **
        //^ represents bitwise calculation
        Math.pow(2, 2);
        x=x*x;

        int x1,x2,y1,y2;
        x1=0;
        x2=4;
        y1=0;
        y2=4;

        //distance formula - go
        
        double preAnsX =Math.pow(2, (x2-x1));
        double preAnsY = Math.pow(2, (y2-y1));
        double ans= Math.sqrt((preAnsX)+(preAnsY));
        System.out.print(ans);


    }
    
}
