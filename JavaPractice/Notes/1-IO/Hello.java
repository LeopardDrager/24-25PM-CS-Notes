/*  public -> Anyone (in this file's scope) can interact with!
*   class -> type of file -> Group of Objects -> What will be compiled 
*   Hello -> Filename and again, spelled the exact same way as the file...
*/


public class Hello {
    //coment out one line of code
    /* 
        public -> Anyone (in this file's scope) can interact with it!
        static -> Doesn't need an object
        void -> empty or null -> does not return anything 
        main(String[] args) -> starting function() that needs an array of strings, we call it args.
    */   


    public static void main(String[] args){

        /* 
            System -> System module to handle objects and function() that deal with the sys 
            out -> subclass that deals with output of information
            println() -> print with a new line at the end of the data
        */
 
        System.out.println("Hello World");
        /*
            Escape characters basically a special character
            \n -> new line 
            \t -> tab
            \s -> space
            \\ -> \
            \" -> "
        */

        
        //               (regex,data) 
        System.out.printf("%2.2f%n",12345.6789);    
        System.out.printf("%16.2f%n",12345.6789);    


        /*
         %#.#1
        first # is length of data
        second # is rounding of data
        l -> formatting character
        */

        System.out.print("string data");
        System.out.print(123456);
        System.out.print(123456.789);
        System.out.print(false);

    }

}

