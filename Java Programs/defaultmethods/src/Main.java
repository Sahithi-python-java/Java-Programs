interface Animal {
    void makeSound(); // Abstract method

    // Default method with an implementation
    default void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark");
    }

    // Dog class doesn't override sleep(), so it uses the default version
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow");
    }

    // Cat class overrides sleep() for custom behavior
    @Override
    public void sleep() {
        System.out.println("Cat sleeps quietly");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound(); // Output: Bark
        dog.sleep();     // Output: Sleeping...

        cat.makeSound(); // Output: Meow
        cat.sleep();     // Output: Cat sleeps quietly
    }
}
