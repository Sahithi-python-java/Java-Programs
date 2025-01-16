import java.util.ArrayList;

public class WrapperExample {
    public static void main(String[] args) {
        // Primitive types
        int x = 5;
        char c = 'A';

        // Wrapper classes
        Integer integerObj = Integer.valueOf(x); // Autoboxing: primitive to object
        Character charObj = Character.valueOf(c); // Autoboxing: primitive to object

        // Using wrapper class methods
        System.out.println(integerObj.intValue());  // Unboxing: object to primitive
        System.out.println(charObj.charValue());    // Unboxing: object to primitive

        // Collections example
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // Autoboxing: primitive int to Integer
        numbers.add(20);
        System.out.println(numbers);
    }
}
