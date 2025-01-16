public class MainMethod {
    int a1 = 10;
    int b1 = 20;
    int c1 = a1 + b1;

    public static void main(String[] args) {
        // Create an object of the MainMethod class
        MainMethod obj = new MainMethod();

        // Access the instance variable c1 through the object
        System.out.println("The sum of two numbers is: " + obj.c1);
    }
}
