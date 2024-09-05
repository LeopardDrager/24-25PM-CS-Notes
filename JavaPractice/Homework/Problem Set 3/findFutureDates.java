import java.util.Scanner;



public class findFutureDates {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.print("Enter today's date: ");
        int todayDate = ui.nextInt();
        
        if (todayDate == 0){
            System.out.println("Today is Sunday");
        }else if (todayDate == 1){
            System.out.println("Today is Monday");
        }else if (todayDate == 2){
            System.out.println("Today is Tuesday");
        }else if (todayDate == 3){
            System.out.println("Today is Wednesday");
        }else if (todayDate == 4){
            System.out.println("Today is Thursday");
        }else if (todayDate == 5){
            System.out.println("Today is Friday");
        }else if (todayDate == 6){
            System.out.println("Today is Saturday");
        }

        
        System.out.print("Enter the number of days elapsed since today: ");
        int daysSince = ui.nextInt();

        int future=((todayDate + daysSince) % 7);

        if (future == 0){
            System.out.println("The future day is Sunday");
        }else if (future == 1) {
            System.out.println("The future day is Monday");
        }else if (future == 2){
            System.out.println("The future day is Tuesday");
        }else if (future == 3){
            System.out.println("The future day is Wednsday");
        }else if (future == 4){
            System.out.println("The future day is Thursday");
        }else if (future == 5){
            System.out.println("The future day is Friday");
        }else if (future == 6){
            System.out.println("The future day is Saturday");
        }

        


        ui.close();}
    }
    

