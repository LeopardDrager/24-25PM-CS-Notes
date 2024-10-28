import java.util.ArrayList;
import java.util.Scanner;
public class VetManger {
        // ArrayLists to hold different types of animals
        private static ArrayList<Dog> dogs = new ArrayList<>();
        private static ArrayList<Cat> cats = new ArrayList<>();
        private static ArrayList<Dragon> dragons = new ArrayList<>();
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean running = true;
            while (running) {
                printMenu();
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline
                switch (choice) {
                    case 1:
                        addAnimal(scanner);
                        break;
                    case 2:
                        viewAnimals(scanner);
                        break;
                    case 3:
                        //modifyAnimal(scanner);
                        break;
                    case 4:
                        //removeAnimal(scanner);
                        break;
                    case 5:
                        //saveAndClose();
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


        private static void addAnimal(Scanner scanner){
            //ask for species
            System.out.println("Dog(1): \nCat(2): \nDragon(3): ");
            int type = scanner.nextInt();
            //ask for name, breed, gender, age
            System.out.println("Name: ");
            String name = scanner.next();
            System.out.println("Breed: ");
            String breed = scanner.next();
            System.out.println("Gender: ");
            String gender = scanner.next();
            System.out.println("Age: ");
            int age = scanner.nextInt();
            //create animal
            switch(type){
                //add the animal to the appropriate array list
                case 1:
                    Dog newDog = new Dog(name, breed, gender, age);
                    dogs.add(newDog);
                case 2:
                    Cat newCat = new Cat(name, breed, gender, age);
                    cats.add(newCat);
                case 3:
                    Dragon newDragon = new Dragon(name, breed, gender, age);
                    dragons.add(newDragon);
                
            }


            System.out.println("Animal successfully added!");
        }
        private static void viewAnimals(Scanner scanner){
            //ask for species
            System.out.println("Dog(1): \nCat(2): \nDragon(3): ");
            int type = scanner.nextInt();
            
            // view animal
            switch(type){
                case 1:
                    for(int i=0; i<dogs.size();i++){
                        System.out.println(dogs.indexOf(i));
                    }
                case 2:
                    for(int i=0; i<cats.size();i++){
                        System.out.println(cats.indexOf(i));
                    }
                case 3:
                    for(int i=0; i<dragons.size();i++){
                        System.out.println(dragons.indexOf(i));
                    }
                
            }

        }
}