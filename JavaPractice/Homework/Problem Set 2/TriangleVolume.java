import java.util.Scanner;
public class TriangleVolume {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Enter length of the sides and height of the Equilateral triangle: "); //Getting the length
        double length = ui.nextDouble();
        double rad3 = Math.sqrt(3);

        double area = (rad3 / 4) * Math.pow(length, 2); //Finding area
        double volume = (area * length); //Finding the volume
        System.out.printf("The area is: %.2f%n", + area);
        System.out.printf("The volume of the Triangular prism is %.2f%n", + volume);

    ui.close();}
}
