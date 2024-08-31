import java.util.Scanner;
public class MinuteYearConveter {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);

        System.out.println("Please enter the number of minutes for me to convert to years."); //Asking user for minutes
        double minutes = ui.nextDouble();

        double yearNotRounded = (minutes * 1.9013E-6);
        double yearRounded = Math.round((minutes * 1.9013E-6)); 
        double days = Math.round(((yearNotRounded-yearRounded) * 365.3)) ;
        
        
        System.out.print(minutes + " minutes is approximately ");
        System.out.printf("%.0f",yearRounded);
        System.out.print(" years and ");
        System.out.printf("%.0f", days);
        System.out.print(" days");
        // System.out.println(month);

        
    }
}
