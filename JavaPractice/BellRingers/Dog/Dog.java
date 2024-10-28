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

    
        public String toString() {
            return "\nName: " + name +
                    "\nBreed: " + breed +
                    "\nGender: " + gender +
                    "\nAge: " + age;
        }
        public String eat() {
            return "\n" + name + " is munching on some gross food!";
        }
        public String sleep() {
            return "\n" + name + " is snoozing away!";
        }
        public String poop(){
            return "\n" + name + " was a bad " + gender + " and pooped!";
        } 
}