public class Cat {
    String name, breed, gender;
    int age;
    public Cat(String name, String breed, String gender, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
    }
    public void eat() {
        System.out.println(name + " the cat is nibbling on some fish!");
    }
    public void sleep() {
        System.out.println(name + " the cat is curled up and purring.");
    }
    public void poop() {
        System.out.println(name + " the cat used the litter box.");
    }
    @Override
    public String toString() {
        return "Cat: " + this.name;
    }
}