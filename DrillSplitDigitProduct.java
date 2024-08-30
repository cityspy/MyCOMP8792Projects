import java.util.Scanner;

public class DrillSplitDigitProduct {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter a 6-digit integer
        System.out.println("Enter a 6-digit integer");
        int number = scan.nextInt();

        // Check if the number is a 6-digit integer
        if (number < 100000 || number > 999999) {
            System.out.println("The number is not a 6-digit integer.");
            scan.close();
            return;
        }

        // Initialize the product variable
        int product = 1;

        // Compute the product of the digits
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            product *= digit;
            temp /= 10;
        }

        // Output the product
        System.out.println("The product of all of the digits is " + product);

        // Close the Scanner object
        scan.close();
    }
}
