public class Cat{
    //field variable or global variables
    private String name, breed, gender;
    private int age;

    //Constructor - builds an object
    public Dragon(String newName, String breed, String gender, int age){
        //this is to allow java to connect the name variable to the object we call in 
        //  other files. Without this, Java will not understand what var you're accessing
        this.name = newName;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        // System.out.println(newName);
        // System.out.println(this.name+" was created!");
    }

    //technically you should have your no-arg Constructor
    public Dragon(){}

    //getters and setters

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


    @Override
    public String toString() {
        return "Dragon [name=" + this.name + "]";
    }
    
}