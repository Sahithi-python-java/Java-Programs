interface Animal {
    void makeSound();

    default void sleep() {
        System.out.println("Sleeping...");
    }

    // Static method in the interface
    static void info() {
        System.out.println("This is the Animal Interface");
    }
}

public class Main {
    public static void main(String[] args) {
        // Call the static method directly on the interface
        Animal.info();  // Output: This is the Animal Interface
    }
}
