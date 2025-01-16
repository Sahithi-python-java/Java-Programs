import java.util.Scanner;
public class MultiplyNumbers {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int product = firstNumber * secondNumber;

        System.out.println("The product of " + firstNumber + " and " + secondNumber + " is: " + product);
        scanner.close();
    }
}
