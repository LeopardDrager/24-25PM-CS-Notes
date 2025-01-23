import java.util.Scanner;

public class FBISecret {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Prompt for shift value
            System.out.println("Enter the shift value:");
            int shift = scanner.nextInt();
            scanner.nextLine(); // Consume a newline

            // Exit if shift value is -1
            if (shift == -1) {
                System.out.println("Exiting program.");
                break;
            }

            System.out.println("Enter your message:"); // Prompt for the message

            String message = scanner.nextLine();

            // Encode the message
            String encodedMessage = encodeMessage(message, shift);

       
            System.out.println("The encrpyted message is: " + encodedMessage);// Display the encoded message
        }
        scanner.close();
    }

   
    public static String encodeMessage(String message, int shift) { // Method to encode the message using the shift cipher
        StringBuilder encoded = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (c >= 'a' && c <= 'z') { // Only encode lowercase letters
                int originalIndex = c - 'a';
                int newIndex = (originalIndex + shift) % 26;
                if (newIndex < 0) { // Handle negative shifts
                    newIndex += 26;
                }
                encoded.append((char) ('a' + newIndex));
            } else {
                encoded.append(c); // Keep spaces unchanged
            }
        }
        return encoded.toString();
    }
}
