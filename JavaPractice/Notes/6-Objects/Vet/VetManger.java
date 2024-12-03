import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class VetManger {
    // ArrayLists to hold different types of animals
    private static ArrayList<Dog> dogs = new ArrayList<>();
    private static ArrayList<Cat> cats = new ArrayList<>();
    private static ArrayList<Dragon> dragons = new ArrayList<>();
    private static ArrayList<Bird> birds = new ArrayList<>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        /*
            try{
                // loadAnimals()
            }
            catch (Exception e){
                System.err.println("Error loading db...  sorry...");
            }
        */
        while (running) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            switch (choice) {
                case 1:
                    //CREATE Route
                    addAnimal(scanner);
                    break;
                case 2:
                    //READ Route 
                    viewAnimals();
                    break;
                case 3:
                    //UPDATE Route
                    modifyAnimal(scanner);
                    break;
                case 4:
                    //DELETE Route
                    removeAnimal(scanner);
                    break;
                case 5:
                    saveAndClose();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
    private static void printMenu() {
        System.out.println("\n--- Vet Management System ---");
        System.out.println("1. Add Animal");
        System.out.println("2. View Animals");
        System.out.println("3. Modify Animal");
        System.out.println("4. Remove Animal");
        System.out.println("5. Save and Close");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addAnimal(Scanner scanner) {
        System.out.println("Choose a species: \n\t1. Dog\t2. Cat\t3. Dragon\t4. Bird");
        int type = scanner.nextInt();
    
        System.out.println("Enter the name:");
        String name = scanner.next();
    
        System.out.println("Enter the breed (no numbers allowed):");
        String breed = scanner.next();
        while (!breed.matches("[a-zA-Z ]+")) {
            System.out.println("Invalid breed. Enter again:");
            breed = scanner.next();
        }
    
        System.out.println("Enter the gender (m or f):");
        String gender = scanner.next();
        while (!gender.equalsIgnoreCase("m") && !gender.equalsIgnoreCase("f")) {
            System.out.println("Invalid gender. Enter 'm' or 'f':");
            gender = scanner.next();
        }
    
        System.out.println("Enter the age (a positive number):");
        int age = scanner.nextInt();
        while (age < 0) {
            System.out.println("Invalid age. Enter again:");
            age = scanner.nextInt();
        }
    
        switch (type) {
            case 1:
                dogs.add(new Dog(name, breed, gender, age));
                break;
            case 2:
                cats.add(new Cat(name, breed, gender, age));
                break;
            case 3:
                dragons.add(new Dragon(name, breed, gender, age));
                break;
            case 4:
                birds.add(new Bird(name, breed, gender, age));
                break;
            default:
                System.out.println("Invalid species selection.");
        }
    
        System.out.println("Animal successfully added!");
    }
    

    private static void viewAnimals() {
        System.out.println("\n------ DOGS ------");
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    
        System.out.println("\n------ CATS ------");
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    
        System.out.println("\n------ DRAGONS ------");
        for (Dragon dragon : dragons) {
            System.out.println(dragon);
        }
    
        System.out.println("\n------ BIRDS ------");
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    

    private static void modifyAnimal(Scanner scanner) {
        System.out.println("Choose a species: \n\t1. Dog\t2. Cat\t3. Dragon\t4. Bird");
        int type = scanner.nextInt();
    
        ArrayList<?> selectedList = null;
    
        switch (type) {
            case 1:
                selectedList = dogs;
                break;
            case 2:
                selectedList = cats;
                break;
            case 3:
                selectedList = dragons;
                break;
            case 4:
                selectedList = birds;
                break;
            default:
                System.out.println("Invalid species type.");
                return;
        }
    
        System.out.println("Enter the name of the animal:");
        for (Object animal : selectedList) {
            System.out.println(animal.toString());
        }
        String name = scanner.next();
    
        Object selectedAnimal = findAnimalByName(selectedList, name);
    
        if (selectedAnimal == null) {
            System.out.println("Animal not found.");
            return;
        }
    
        System.out.println("Choose a property to modify: \n\t1. Name\t2. Breed\t3. Gender\t4. Age");
        int property = scanner.nextInt();
    
        modifyAnimalProperty(scanner, selectedAnimal, property);
        System.out.println("Animal updated successfully.");
    }
    private static Object findAnimalByName(ArrayList<?> list, String name) {
        for (Object animal : list) {
            if (animal.toString().contains("name=" + name)) {
                return animal;
            }
        }
        return null;
    }
    private static void modifyAnimalProperty(Scanner scanner, Object animal, int property) {
        try {
            switch (property) {
                case 1: // Name
                    System.out.println("Enter the new name:");
                    String newName = scanner.next();
                    animal.getClass().getMethod("setName", String.class).invoke(animal, newName);
                    break;
                case 2: // Breed
                    System.out.println("Enter the new breed:");
                    String newBreed = scanner.next();
                    animal.getClass().getMethod("setBreed", String.class).invoke(animal, newBreed);
                    break;
                case 3: // Gender
                    System.out.println("Enter the new gender (m or f):");
                    String newGender = scanner.next();
                    animal.getClass().getMethod("setGender", String.class).invoke(animal, newGender);
                    break;
                case 4: // Age
                    System.out.println("Enter the new age:");
                    int newAge = scanner.nextInt();
                    animal.getClass().getMethod("setAge", int.class).invoke(animal, newAge);
                    break;
                default:
                    System.out.println("Invalid property choice.");
            }
        } catch (Exception e) {
            System.out.println("Error updating property: " + e.getMessage());
        }
    }
        
    private static void removeAnimal(Scanner scanner){
        System.out.println("Choose a species: \n\t1. Dog\t2. Cat\t3. Dragon");
        int type = scanner.nextInt();
        if(type==1){
            //choose the animal
            System.out.println("Which doggy? (name)");
            for(Dog dog:dogs){
                System.out.println(dog);
            }
            String name = scanner.next();
            //find an object in an ArrayList
            for(Dog dog:dogs){
                if (dog.getName().equals(name)){
                    //set the new data
                    dogs.remove(dog);
                }
            }
        }
        else if(type==2){
            System.out.println("Which cat? (name)");
            for (Cat cat:cats){
                System.out.println(cat);
            }
            String name = scanner.next();
            for(Cat cat:cats){
                if (cat.getName().equals(name)){
                    cats.remove(cat);
                }
            }

        }
        else if(type==3){
            System.out.println("Which dragon? (name)");
            for (Dragon dragon:dragons){
                System.out.println(dragon);
            }
            String name = scanner.next();
            for(Dragon dragon:dragons){
                if (dragon.getName().equals(name)){
                    dragons.remove(dragon);

        }
        System.out.println("Animal Removed");
            }
        }
    }

    private static void saveAnimals(Scanner scanner) {
        System.out.println("Would you like to save(s) or exit(e)");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("s")){

        try (FileWriter writer = new FileWriter("animals.txt")) {
            for (Dog dog : dogs) {
                writer.write("Dog," + dog.getName() + "," + dog.getBreed() + "," + dog.getGender() + "," + dog.getAge() + "\n");
            }
            for (Cat cat : cats) {
                writer.write("Cat," + cat.getName() + "," + cat.getBreed() + "," + cat.getGender() + "," + cat.getAge() + "\n");
            }
            for (Dragon dragon : dragons) {
                writer.write("Dragon," + dragon.getName() + "," + dragon.getBreed() + "," + dragon.getGender() + "," + dragon.getAge() + "\n");
            }
            for (Bird bird : birds) {
                writer.write("Bird," + bird.getName() + "," + bird.getBreed() + "," + bird.getGender() + "," + bird.getAge() + "\n");
            }
            System.out.println("Animals saved successfully.");

        } catch (IOException e) {
            System.err.println("Error saving animals: " + e.getMessage());
            }
        }else if (choice.equalsIgnoreCase("e")){
            System.exit(0);
        }else{
           
        }
    }
}