import java.util.Scanner;

public class TriangleArea {
    public static void main(String [] Args){

        Scanner ui = new Scanner(System.in);

        System.out.print("Please enter the cordnates of three points seperated by spaces. ");

        double[] cordnatePoints = new double[6];
        cordnatePoints[0] = ui.nextDouble();
        cordnatePoints[1] = ui.nextDouble();
        cordnatePoints[2] = ui.nextDouble();
        cordnatePoints[3] = ui.nextDouble();
        cordnatePoints[4] = ui.nextDouble();
        cordnatePoints[5] = ui.nextDouble();

        double distanceFromX1toX2 = Math.sqrt(Math.pow(cordnatePoints[2] - cordnatePoints[0],2) + Math.pow(cordnatePoints[3] - cordnatePoints[1],2));
        double distanceFromX1toX3 = Math.sqrt(Math.pow(cordnatePoints[4] - cordnatePoints[0],2) + Math.pow(cordnatePoints[5] - cordnatePoints [1],2));   // Finding the distances of each points for later     
        double distanceFromX2toX3 = Math.sqrt(Math.pow(cordnatePoints[4] - cordnatePoints[2],2) + Math.pow(cordnatePoints[5] - cordnatePoints [3],2));
        
        System.out.println(distanceFromX1toX2);
        System.out.println(distanceFromX2toX3);
        System.out.println(distanceFromX1toX3);

        double semiPerimter = ((distanceFromX1toX2 + distanceFromX1toX3 + distanceFromX2toX3)/2);
        System.out.println (semiPerimter);
        

        double triangleArea = Math.sqrt((semiPerimter * (semiPerimter-distanceFromX1toX2) * (semiPerimter-distanceFromX2toX3) * (semiPerimter-distanceFromX1toX3) ));
        System.out.println(triangleArea);


        // double s = ()
        // double area = Math.sqrt(0)

        ui.close();
    }
    // x1 to x2 find the distance 
    //
}
// used this to help me with array stuff https://www.youtube.com/watch?v=yHvQVc0WUF4 