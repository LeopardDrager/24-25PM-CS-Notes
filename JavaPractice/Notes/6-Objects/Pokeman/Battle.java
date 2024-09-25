import java.util.Scanner;


public class Battle {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);

        
        //Build Pokemon
        Pokemon myPokeMan = new Pokemon("32","Electric",200,"Debuggardon","17in","10lbs", "Stack Overflows", 100, "Syntax Error", 50, "selfie" );
        Pokemon AshBud = new Pokemon("830","Water",200,"Ash's Buddy","7ft","30000lbs", "Water Splash", 120, "Shield", 10, "waterbittle.jpg" );
        

        //Welcome to the battle
        System.out.println("A willd battle appears!");
        //Your pokemon: <poke name> Hp: <poke hp>
        System.out.println("Your Pokemon: "+myPokeMan.getName()+"\n\tHP: " +myPokeMan.getHp());
        System.out.println("Opponent's Pokemon: "+AshBud.getName()+"\n\tHP: " +AshBud.getHp());

        //Battle Loop
        while(myPokeMan.getHp()>=0 && AshBud.getHp()>=0){
            System.out.println("\nChoose an attack for " +myPokeMan.getName());
            System.out.println("1. " +myPokeMan.getAttack1Name()+"\tDamage: " +myPokeMan.getAttack1Damage());
            System.out.println("2. " +myPokeMan.getAttack2Name()+"\t\tDamage: " +myPokeMan.getAttack2Damage());
            String choice = ui.next();
            int damage = 0;
            //Attack Switch Statement - this is a condtitional loop aka glorified if statement loop
            switch(choice){
                case "1":
                    damage = myPokeMan.getAttack1Damage();
                    System.out.println(myPokeMan.getName()+" used : " +myPokeMan.getAttack1Name());
                    break;
                case "2":
                    damage = myPokeMan.getAttack2Damage();
                    System.out.println(myPokeMan.getName()+" used : " +myPokeMan.getAttack2Name());
                    break;
                default:
                    System.out.println("You loose a turn looser");
                    continue;
            } 
        //Apply damage
        AshBud.setHp(AshBud.getHp() - damage );
        System.out.println("Opponent's Pokemon: "+AshBud.getName()+"\n\t\t HP: "+AshBud.getHp());

        
        if(AshBud.getHp()<=0){
            System.out.println(AshBud.getName() + " fainted!");
            break;
            }
        }
        //Check if pokemon dead

        
        //Opponent's turn - repeat from above


        ui.close();
    }
}
