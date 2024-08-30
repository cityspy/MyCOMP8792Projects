import java.util.Scanner;

public class DrillSplitDigitFourthDigit {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Prompt user for a 5-digit integer
        System.out.println("Enter a 5-digit integer");
        int number = scan.nextInt();

        // Close the Scanner object
        scan.close();

        // Check if the input number is a 5-digit number
        if (number < 10000 || number > 99999) {
            System.out.println("The number is invalid. It should be a 5-digit number.");
            return;
        }

        // Convert the number to a string to easily access specific digits
        String numberStr = Integer.toString(number);

        // Get the fourth digit (index 3 because string index is zero-based)
        char fourthDigitChar = numberStr.charAt(3);

        // Convert the character to an integer
        int fourthDigit = Character.getNumericValue(fourthDigitChar);

        // Check if the fourth digit is greater than or equal to 6
        if (fourthDigit >= 6) {
            System.out.println("The number is true");
        } else {
            System.out.println("The number is false");
        }
    }
}
