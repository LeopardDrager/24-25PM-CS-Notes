import java.util.ArrayList;
public class Dragon{
    //field variable or global variables
    String name, breed, gender;
    int age;
    ArrayList<String> tricks = new ArrayList<String>();
    //Constructor - builds an object
    public Dragon(String name, String breed, String gender, int age){
        //this is to allow java to connect the name variable to the object we call in
        //  other files. Without this, Java will not understand what var you're accessing
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
    }
    //technically you should have your no-arg Constructor
    public Dragon(){}
    //getters and setters
    public void getTricks(){
        System.out.println(this.tricks);
    }
    //extra f(x)
    public void eat(){
        //this.name so that Java will understand what object's name needs to be called
        System.out.println(this.name + " the dragon ate charcoal and tums!");
    }
    public void sleep(){
        System.out.println(this.name + " caught the pillow on fire...");
    }
    public void poop(){
        System.out.println(this.name + " dropped a hot tamale on the front porch!");
    }
    public void train(String newTrick){
        tricks.add(newTrick);
    }
    //toString
    @Override
    public String toString(){
        return "Dragon: "+this.name;
    }
}