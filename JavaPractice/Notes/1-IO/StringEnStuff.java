public class StringEnStuff {
    

/*
 * Data Types
 *      Primitive - initial or the first - boolean, integers, characters, double/float
 *                                         boolean, int, chr, double     
 *      Non-Primitive - non native - Strings, Arrays, Arrays, ArrayList, List
 * 
 *  #1 way to tel if it is pri/non-pri is the Capitalization 
 * 
 * String name = "bob";     -> name is not a var, it is an object
 * int x = 4;   -> x is now the object x
 * 
 * 
 * 
 * 
 * 
 * 
 */

int x = 4;          // int is primitive
Integer x2 = 4;      // Integer is non-primitive

double gpa = 4.0;       //  This is litterally a number
Double gpa2 = 4.0;       //  This can convert and check for things


public static void main(String[] args){
    
    String name = "jin"; // use double quotes "" - these are for strings
    char letter = 'j' ; // use single quotes '' - these are for characters.
    



    int age = 40;
    boolean old = true;
    double pi = 3.14; 
    float fpi = 3.14f; // instead of float use double



    String email = "jinTheDestroyer9000@aol.com";
    String password = new String();
    password = "funpassword"; 

    // first I wasnt the username - grab everything up to the @ sign
    //substring()   -> grabs a sub portion of a string
    String username = email.substring(0,19);
    String domain = email.substring(20);
    System.out.println(username);
    System.out.println(domain);


    //let's find the @ symbol

    int atLoc = email.indexOf("@"); // find the string in the string obj
    username = email.substring(0,atLoc);

    //here's the email input -> jimmy.bob@evsck12.com
    //add stu . between the @ and evsck12.com

    String firstPart = "jimmy.bob@evsck12.com".substring(0,"jimmy.bob@evsck12.com".indexOf("@"));
    String lastPart ="jimmy.bob@.evsck12.com".substring("jimmy.bob@evsck12.com".indexOf("e"));

    String corrected = firstPart+"stu"+lastPart;
    System.out.println("\n"+corrected);
    System.out.println("\n"+"jimmy.bob@evsck12.com".substring(0,"jimmy.bob@evsck12.com".indexOf(("@"))+1)+"stu."+"jimmy.bob@evsck12.com".substring("jimmy.bob@evsck12.com".indexOf("e")));



}



}
