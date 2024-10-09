import java.util.Random;
import java.util.Scanner;


public class LoopinStrings {
    public static void main(String[] args) {
        //Strings are a type of sequence daya
        /*
         *          Sequences - collection of data built together 
         *              - Strings
         *              - Arrays
         *              - ArrayList
         *              - Dictionaries (Python) aka JSON ask Hash Map 
         *              - List
         *              - Tuples ()
         *          BIG TAKE AWAY = you can iterate through this data 
         */

         //1. count the number of a certain char in a string
         //2. find all of the /s/s and replace them with a signle /s
         //3. enter the word banana and return the word bnn
         //4. replace items in a string:
         //        ie: "I like potatoes with a side of potato sauce","potatot","poop"
         //5. Compress a string
         //     ie: "aabccccaaaa" -> "a2b1c4a3"
         //6. Convert a string into each character's binary
         //     ie: "bab" -> 98 97 98 but in binary
         
         /*
         *NO NO methods and NO NO CHEAT CODES
         *      String.replaceAll   String.replace
         *      StringBuilders
         * 
          */ 
          //1.
                char c ='d';
                String s = "hjhgkdjfld;jfajskg;dskg";
                int counttoo = 0;
                for (int i = 0; i < s.length(); i++ ){
                    if (s.charAt(i) == c){
                        counttoo++; 
                    }
                }
                System.out.println(counttoo);

            //2.

                    String str = "hi  hello  bonjour  konichiwa  namaste  hola  SUP";
                    String newStr = "";

                 
                    while(str.contains("  ")){
                        int firstSS = str.indexOf("  ");
                        newStr = str.substring(0, firstSS) + " " + str.substring(firstSS+2);
                    }
                    
                    System.out.println(newStr);








            //3. 
                String inputWord = "banana";
                String vowels = "aeiouAEIOU";
                String vowely = "aeiouyAEIOUY";
                String result = "";
                Random randy = new Random();
                int y = randy.nextInt(2);
        
                for (int g = 0; i < inputWord.length(); i++) {
                char n = inputWord.charAt(g);
                if (vowels.indexOf(n) == -1) {
                 result += n;
             }else{
                if  (vowels.indexOf(c) == -1) {
                    resuilt += c;
                }
             }

         }
         System.out.println(result);
         

         // 4.
            String original = "I like potatoes with a side of potato sauce";
            int index = original.indexOf("potato");
            System.out.println("I like potatoes with a side of potato sauce");
            Scanner ui = new Scanner(System.in);
            System.out.println("put in something: ");
        String something = ui.nextLine();
        while (index != -1) {
            original = original.substring(0, index) + something + original.substring(index + "potato".length());
            index = original.indexOf("potato", index + something.length());
        }
        System.out.println(original);




            //5.
            

            





            //6.       
               
          System.out.print("01100010 01100001 01100010"); 
          


          



 



        }


    
}
