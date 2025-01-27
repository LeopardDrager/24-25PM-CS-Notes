import java.util.Scanner;


public class EndOfWorldCommunication {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Welcome to the Tellurian Translator!");
                
                boolean continueTranslation = true;
        
                while (continueTranslation) {
                
                    System.out.print("Enter a sentence to translate: ");    // Prompt user for input
                    String sentence = scanner.nextLine();
        
                 
                    String translated = translateToTellurian(sentence);   // Translate the sentence
                    System.out.println(translated);
        
                 
                    System.out.print("Do you wish to continue? (y/n): ");   // Ask user if they wish to continue
                    String response = scanner.nextLine().trim();
                    if (!response.equalsIgnoreCase("y")) {
                        continueTranslation = false;
                    }
                }
        
                System.out.println("Goodbye!");
                scanner.close();
            }
        
            // Method to translate a sentence to Tellurian
            private static String translateToTellurian(String sentence) {
                StringBuilder result = new StringBuilder();
        
             
                String vowels = "aeiou";   // Declaring the bad letters,vowels
        
                
                String[] words = sentence.toLowerCase().split(" ");// Iterate through each word in the sentence
                for (String word : words) {
                    if (word.equals("i") || word.equals("a")) {
                        result.append(word).append(" "); // Keep "I" and "a" as is
                        continue;
                    }
        
                    for (char c : word.toCharArray()) {
                        if (!vowels.contains(String.valueOf(c))) {
                            result.append(c); // Append consonants and punctuation
                        }
                    }
                    result.append(" "); // Add space between words
                }
        
                return result.toString().trim();
            
    }
}