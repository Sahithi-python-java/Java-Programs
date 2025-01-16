import java.util.ArrayList;
import java.util.List;

// Base interface
interface Shape {
    void draw();
}

// Subclass 1
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}



// Subclass 2
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class PolymorphicShapeList {
    public static void main(String[] args) {
        // Polymorphic parameterized list
        List<Shape> shapes = new ArrayList<>();

        // Adding objects of subclasses
        shapes.add(new Circle()); // Circle is-a Shape
        shapes.add(new Rectangle()); // Rectangle is-a Shape

        // Iterating over the list
        for (Shape shape : shapes) {
            shape.draw(); // Polymorphism in action
        }
    }
}


//        Key Features in Both Examples:
//        Base Class/Interface as the Parameterized Type:
//
//        The list is declared as List<Shape> or List<Person>,
//        allowing it to hold objects of any class that implements Shape or extends Person.
//        Adding Subclass Objects:
//
//        Objects of Circle, Rectangle, Employee, and Manager are added to the list due to
//        the "is-a" relationship.
//        Runtime Polymorphism:
//
//        The draw() or work() method is called based on the actual type of the object at runtime,
//        demonstrating polymorphism.
