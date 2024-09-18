import java.util.Random;
import java.util.random.*;
public class randomCard{
    public static void main (String[]args){
        Random random = new Random();
        int numberOfCard = random.nextInt(0,15);
        int numberForTypeOfCard = random.nextInt(1,5);
        String typeOfCard = "not known";
        String specialCard = "";

        if (numberForTypeOfCard == 1){
            typeOfCard = "Spades";
        }else if (numberForTypeOfCard == 2){
            typeOfCard = "Clubs";
        }else if (numberForTypeOfCard == 3){
            typeOfCard = "Diamonds";
        }else if (numberForTypeOfCard == 4){
            typeOfCard = "Hearts";
        }

        if (numberOfCard == 11){
            specialCard = "Jack";
        }else if (numberOfCard == 12){
            specialCard = "Queen";
        }else if (numberOfCard == 13){
            specialCard = "King";
        }else if (numberOfCard == 14){
            specialCard = "Ace";
        }

        if (numberOfCard > 10){ 
            System.out.println("You got a " + specialCard + " of " + typeOfCard);
        }else{
            System.out.println("You got a " + numberOfCard + " of " + typeOfCard);
        }


        
    }


}
//club,spades,diamond,and heart