public class Main {

    public static void main(String[] args) {
        Dog bluey = new Dog("Bluey", "Scottish Terrier", "Female", 6);
        System.out.println(bluey);
        System.out.println(bluey.eat());
        System.out.println(bluey.sleep());
        System.out.println(bluey.poop());
    }
}