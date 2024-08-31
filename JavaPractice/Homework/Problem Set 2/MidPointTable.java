import java.util.Scanner;
public class MidPointTable {
    public static void main(String[] args) {
        
        Scanner ui = new Scanner(System.in);
       
        System.out.println("First enter how many mid points you would like to be solved!");
        int midPointCount = ui.nextInt();

        double[] cordnates = new double [midPointCount*4]; // mutiplying by 4 because each midPoint needs 4 cordnates to calc
        double[] midPointX = new double [midPointCount*2]; // mutiplying by 2 because each midPoint has 2 xs and 2 ys
        double[] midPointY = new double [midPointCount*2]; // ⬆️ 
                                                           //I added an emoji before on my Practice_Unity/Scripts/PlayerMovement.cs file its on my github
        int xOffset = 0; // this is the offset so each calculation pulls the right number for x and y                               
        int yOffset = 1; 


        System.out.println("Please enter the point you would like to be calculated seperated by a. EX: \"4 5\" is x1=4 y1=5"); // Showing user how to enter and asking user how many mid points they want to be know.
      
      
        for (int i = 0; i < midPointCount*4; i++){ // Taking in user input multiplied by 4 because each midPoint needs 4 values
            cordnates[i] = ui.nextDouble();

        }for (int i = 0; i < midPointCount; i++){
            
            midPointX[i]=((cordnates[xOffset] + cordnates[xOffset+2])/2); // I spent about an hour trying to think this through untill it just clicked
            midPointY[i]=((cordnates[yOffset] + cordnates[yOffset+2])/2);
            if (i==0){System.out.println("    a\t\t    b\t    Middle Point");}
            System.out.printf("%.2f,%.2f\t%.2f,%.2f\t%.2f,%.2f\n", cordnates[xOffset], cordnates[yOffset], cordnates[xOffset + 2], cordnates[yOffset + 2], midPointX[i], midPointY[i]); //Only part I had AI help me on as it was a struggle to figure out how to print it out right
            yOffset += 4; // iterate by 4 to keep offset because 0 and 3 is x1 and x2 for first midpoint but 4 is x1 for new midpoint 
            xOffset += 4;
        }
        
        
    ui.close();}
    
}
//used the same video to help me with more complex array stuff, as last time I didn't watch it far enough for me to see a code freindly way for array input https://www.youtube.com/watch?v=yHvQVc0WUF4 