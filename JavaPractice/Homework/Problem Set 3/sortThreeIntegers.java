import java.util.Scanner;
public class sortThreeIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first integer");
        int firstNum = input.nextInt();

        System.out.println("Please enter your second integer");
        int secondNum = input.nextInt();
        
        System.out.println("Please enter your third integer");
        int thirdNum = input.nextInt();
        
        
        if (thirdNum > secondNum && thirdNum > firstNum && firstNum > secondNum ){
            System.out.print(secondNum + ", " + firstNum + ", " + thirdNum);
        }else if (thirdNum > secondNum && thirdNum > firstNum && secondNum > firstNum ){
            System.out.print(firstNum + ", " + secondNum + ", " + thirdNum);
        }else if (secondNum > thirdNum && secondNum > firstNum && firstNum > thirdNum ){
            System.out.print(thirdNum + ", " + firstNum + ", " + secondNum);
        }else if (secondNum > thirdNum && secondNum > firstNum && thirdNum > firstNum ){
            System.out.print(firstNum + ", " + thirdNum + ", " + secondNum);
        }else if (firstNum > thirdNum && firstNum > secondNum && secondNum > thirdNum){
            System.out.print(thirdNum + ", " + secondNum + ", " + firstNum);
        }else if (firstNum > thirdNum && firstNum > secondNum && thirdNum > secondNum){
            System.out.print(secondNum + ", " + thirdNum + ", " + firstNum);
        }


    input.close();}
    
}
