import java.util.ArrayList;
import java.util.List;

// Base class
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void work() {
        System.out.println(name + " is doing generic work");
    }
}

// Subclass 1
class Employee extends Person {
    Employee(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is completing assigned tasks");
    }
}

// Subclass 2
class Manager extends Person {
    Manager(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is managing the team");
    }
}

public class PolymorphicPersonList {
    public static void main(String[] args) {
        // Polymorphic parameterized list
        List<Person> people = new ArrayList<>();

        // Adding objects of subclasses
        people.add(new Employee("Alice"));
        people.add(new Manager("Bob"));

        // Iterating over the list
        for (Person person : people) {
            person.work(); // Polymorphism in action
        }
    }
}
