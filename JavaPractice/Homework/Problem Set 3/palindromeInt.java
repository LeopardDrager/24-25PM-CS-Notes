import java.util.Scanner;



public class palindromeInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int reverse = 0;

        System.out.println("Please enter a integer palindrome");      
        int palindrome = input.nextInt();
        System.out.print(palindrome);
        int originalPal = palindrome;
   
        while (palindrome != 0){
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;  
            palindrome = palindrome / 10;
    }

        if (originalPal == reverse){
            System.out.println( " is a palindrome");
        }else{
            System.out.println(" is not a palindrome");
        }       

    input.close();}
    
}

