import java.util.Scanner;

public class rev4 {

    public static double total = 0;
    public static boolean discount = false;

    public static void main(String[] args) {
        StringBuilder totalForOrder = new StringBuilder();
        String tempSand = orderSandwhich();
        String tempFries = orderFries();
        String tempDrink = orderDrink();
        Scanner ui = new Scanner(System.in);

        int i = 1;
        while (true) {

            if (discount) {
                total = total - 1;
                System.out.println("You get a discount of $1");
            }
            System.out.println("Would you like some ketchup packets? If so how many? $0.25/packet");
            int ketchupPacketCount = ui.nextInt();
            total = total + (ketchupPacketCount * .25);

            totalForOrder.append(Math.round(total * 100) / 100.0).append(",");

            System.out.println("Would you like to order again");
            String orderAgain = ui.next();

            if (orderAgain.equalsIgnoreCase("y")) {
                tempSand = tempSand + " " + orderSandwhich();
                tempFries = tempFries + " " + orderFries();
                tempDrink = tempDrink + " " + orderDrink();
                i++;
            } else {
                System.out.println("You got a " + tempSand + " " + tempFries + " " + tempDrink);

                int startIndex = 0;
                for (int c = 1; c <= i; c++) {
                    int endIndex = totalForOrder.indexOf(",", startIndex);
                    System.out.println("Your " + c + " order was $" + totalForOrder.substring(startIndex, endIndex));
                    startIndex = endIndex + 1;
                }

                System.out.println("Your overall subtotal: " + total);
                System.out.println("Your overall total: " + (total * 1.07));
                break;
            }
        }

        ui.close();
    }

    private static String orderSandwhich() {
        String tempSand = "";
        Scanner ui = new Scanner(System.in);
        System.out.println("Would you like a sandwhich? y/n ");
        String sandwhichChoice = ui.next();

        if (sandwhichChoice.equalsIgnoreCase("y")) {
            discount = true;
            System.out.println("The prices are \n 1. Tofu: $5.75 \n 2. Chicken: $5.25 \n 3. Beef: $6.25 \n 4. None of these");
            int toppingChoice = ui.nextInt();

            if (toppingChoice == 1) {
                tempSand = "tofu sandwhich,";
                total = total + 5.75;
            } else if (toppingChoice == 2) {
                tempSand = "chicken sandwich,";
                total = total + 5.25;
            } else if (toppingChoice == 3) {
                tempSand = "beef sandwhich,";
                total = total + 6.25;
            }
        } else {
            System.out.println("I guess you don't want a sandwhich.");
            discount = false;
        }

        return tempSand;
    }

    private static String orderFries() {
        String tempFries = "";
        Scanner ui = new Scanner(System.in);
        System.out.println("Would a like some fries? y/n ");
        String fryChoice = ui.next();

        if (fryChoice.equalsIgnoreCase("y")) {
            System.out.println("The prices are \n 1. Small: $1.00 \n 2. Medium: $1.75 \n 3. Large: $2.25 \n 4. None of these");
            int sizeChoice = ui.nextInt();
            if (sizeChoice == 1) {
                tempFries = "small fry,";
                total = total + 1.00;
            } else if (sizeChoice == 2) {
                tempFries = "medium fry,";
                total = total + 1.75;
            } else if (sizeChoice == 3) {
                tempFries = "large fry,";
                total = total + 2.25;
            }
        } else {
            System.out.println("I guess you don't want fries.");
            discount = false;
        }

        return tempFries;
    }

    private static String orderDrink() {
        String tempDrink = "";
        Scanner ui = new Scanner(System.in);
        System.out.println("Would you like a drink? y/n ");
        String drinkChoice = ui.next();

        if (drinkChoice.equalsIgnoreCase("y")) {
            System.out.println("The prices are \n 1. Small: $1.00 \n 2. Medium: $1.75 \n 3. Large: $2.25 \n 4. None of these");
            int sizeChoice = ui.nextInt();
            if (sizeChoice == 1) {
                tempDrink = "small drink,";
                total = total + 1.00;
            } else if (sizeChoice == 2) {
                tempDrink = "medium drink,";
                total = total + 1.75;
            } else if (sizeChoice == 3) {
                System.out.println("Would you like to upgrade to a child size for $0.38 more? y/n ");
                drinkChoice = ui.next();
                if (drinkChoice.equalsIgnoreCase("y")) {
                    tempDrink = "child size drink,";
                    total = total + 2.63;
                } else {
                    tempDrink = "large drink,";
                    total = total + 2.25;
                }
            }
        } else {
            System.out.println("I guess you don't want a drink.");
            discount = false;
        }

        return tempDrink;
    }
}