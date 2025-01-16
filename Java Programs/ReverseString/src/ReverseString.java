import java.util.Scanner; // Import the Scanner class for taking user input
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine(); // Read the input string
        String reversedString = new StringBuilder(inputString).reverse().toString();

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);

        // Close the Scanner
        scanner.close();
    }
}