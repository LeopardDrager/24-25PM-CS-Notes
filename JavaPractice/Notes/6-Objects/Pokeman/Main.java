public class Main {
    public static void main(String[] args) {
        String strObj = new String();
        String strObj2 = "bob";
        //DataType objName = new Constructor();
        Pokemon testPokeMan = new Pokemon();
        Pokemon myPokeMan = new Pokemon("32","Electric",200,"Debuggardon","17in","10lbs", "Stack Overflows", 100, "Syntax Error", 50, "selfie" );
        Pokemon AshBud = new Pokemon("830","Water",200,"Ash's Buddy","7ft","30000lbs", "Water Splash", 120, "Shield", 10, "waterbittle.jpg" );
     
        
        System.out.println(AshBud);
        System.out.println(myPokeMan);

        //reset names of pokemon
        testPokemon.setName("Snorlax");
        testPokemon.setID("400");
        testPokemon.setA1N("Yawn");
        testPokemon.setA1D(0);
        testPokemon.setA2N("Sleepy Face");
        testPokemon.setA2D(10);
        System.out.println(testPokemon);


    }
}