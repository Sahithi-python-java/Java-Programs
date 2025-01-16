public class PrimeNumbers {
    public static void main(String[] args) {
        // Loop through numbers from 2 to 100
        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;

            // Check if number is divisible by any number from 2 to number-1
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false; // Number is not prime
                    break; // Exit the inner loop
                }
            }

            // If isPrime is true, then the number is prime
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}
