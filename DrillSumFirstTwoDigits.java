import java.util.Scanner;

public class DrillSumFirstTwoDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Prompt the user to enter a 3-digit integer
        System.out.println("Enter a 3-digit integer");
        int number = scan.nextInt();

        // Check if the number is a 3-digit integer
        if (number < 100 || number > 999) {
            System.out.println("Invalid input. Please enter a 3-digit integer.");
        } else {
            // Extract the digits
            int firstDigit = number / 100;
            int secondDigit = (number / 10) % 10;
            int lastDigit = number % 10;

            // Calculate the sum of the first two digits
            int sumFirstTwo = firstDigit + secondDigit;

            // Determine if the number is valid
            boolean isValid = sumFirstTwo > lastDigit;

            // Output the result
            System.out.println("The number is " + isValid);
        }

        // Close the scanner
        scan.close();
    }
}
