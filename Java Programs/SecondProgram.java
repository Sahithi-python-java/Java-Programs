public class SecondProgram {
    public static void main(String[] args) {
        int a = 20;     // integer value
        float b = 20;   // floating-point value (implicitly 20.0)
        float c = 33.3f; // floating-point value with explicit "f" suffix
        int d = (int) c; // explicit casting of float to int (removes the decimal part)

        // Printing values
        System.out.println(a); // prints 20
        System.out.println(b); // prints 20.0 (since it's float)
        System.out.println(c); // prints 33.3
        System.out.println(d); // prints 33 (float cast to int)
    }
}
