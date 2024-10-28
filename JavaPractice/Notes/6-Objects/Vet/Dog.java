import java.util.jar.Attributes.Name;

public class Dog {
    
    private String name, breed, gender;
    private int age;

    public Dog(String name, String breed, String gender, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
    }
        @Override
        public String toString() {
            return "Dog: " + name;
        }
        public void eat() {
            System.out.print(name +" is munching on some gross food!");
        }
        public void sleep() {
           System.out.println(name + " is snoozing away!");
        }
        public void poop(){
            System.out.println(name + " was a bad " + gender.toLowerCase() + " and pooped!");
        } 
}
