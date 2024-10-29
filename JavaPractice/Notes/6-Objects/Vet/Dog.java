public class Dog{
    //field variable or global variables
    private String name, breed, gender;
    private int age;

    //Constructor - builds an object
    public Dog(String newName, String breed, String gender, int age){
        //this is to allow java to connect the name variable to the object we call in 
        //  other files. Without this, Java will not understand what var you're accessing
        this.name = newName;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        // System.out.println(newName);
        // System.out.println(this.name+" was created!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //technically you should have your no-arg Constructor
    public Dog(){}

    //getters and setters

    //extra f(x)
    public void eat(){
        //this.name so that Java will understand what object's name needs to be called
        System.out.println(this.name + " the dog is munching on some shoes!");
    }
    public void sleep(){
        System.out.println("Is that a dog or a chainsaw");
    }
    public void poop(){
        System.out.println(this.name + " left a dinosaur size turd on the front porch!");
    }

    @Override
    public String toString() {
        return "Dog [name=" + this.name + "]";
    }
    
}