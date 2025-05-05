import java.util.Scanner;
public class ArrayRay {
    public static void main (String[] args) {
        /*
         * Primitive - double, char, int, booleans
         * Non-Primitive - Strings, Lists, Arrays, ArrayList, Objects, Maps, Json, Humans
         * 
         * Sequences - mutilpe piece of data spliced together
         *      - String
         *      - Arrays
         *      - ArrayList
         *      - Maps, Json, List, Collections, Tuples
         *      - Linked List 
         */
        //array data type is immutable as it cannot change length or data after created.

    //    int[] listy = {0,1,2,3,4,5,6,7,8,9};
    //     //int[] numbers = {0,1,2,3.14,4,5};
    //    //int[] objectName = {} you just said this array is filled with in
    //    double[] doublenumbers = {0,1,2,3.14,4,5};
    //    String[] words = {"Hello", " ","World", "4"};
    //    char[] alpha = {'a','b','c'};

    //    //Grocery List
       String[] cart = new String[5]; //predefine how many items are in the list
       double[] cost = new double [5];


    //    System.out.println(listy);
    //    System.out.println(doublenumbers);
    //    System.out.println(words);
    //    System.out.println(alpha);
    //    System.out.println(cart);
    //    System.out.println(cost);

    //    for(int i=0;i<listy.length; i++){
    //         System.out.print(listy[i]+"\s");

    //    }for(int i=0;i<cart.length; i++){
    //     System.out.print(cart[i]+"\s");    
    //    }for(int i=0;i<cost.length; i++){
    //     System.out.print(cost[i]+"\s");
    //    } 

        Scanner ui = new Scanner(System.in);
        for (int i = 0; i < cost.length; i++){
            cost[i]=ui.nextDouble();
        }
        

       //add an  item
    //    cart[0] = "eggs";
    //    cart[1] = "Tortilla Chips";
    //    cart[2] = "Strawberries";
    //    cart[3] = "SPAM";
    //    cart[4] = "Mac N Cheese";
        
       // cart and cost are parallel arrays - item 1 in both list are related
       printHorizontal(cart);
       printVertical(cart);


       //remove an item from an Array
       cart[2]=null;

       //update an item from an Array 
       cart[2]="Attack Helicoper";

       //increase the cart size - typically in a f(x)
       String[] newCart = new String[cart.length+1]; //you could Memmory Leak like a bozo
       //now move the old cart to the new
       for(int i = 0; i < cart.length; i++){
            newCart[i]=cart[i];
       }
       printVertical(cart);

       //ArrayIndexOutofBounds error -  fixed with algorithm above
       newCart[5]="Blueberry Pomegranate Sparkling Water";

    }
    
    private static void printHorizontal(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\s");
        }
        System.out.println();

        //Grid of number -> nest Arrays
        /*
         *      [[1, 2],
         *       [3 , 4]]
         */
        int[][] grid = {
            {1,2},
            {3,4}
        };
        //item row 2 col 2
        int r2c2 = grid[1][1];

        //if you want to print all of the items
        for(int r = 0; r<grid.length;r++){
            for(int c = 0; c < grid[r].length;c++){
                System.out.println(grid[r][c]);
            }
        }
        
    }
    private static void printHorizontal(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\s");
        }
        System.out.println();
    }
    private static void printVertical(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\s");
        }
        System.out.println();
    }
    private static void printVertical(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\s");
        }
        System.out.println();
    }




}