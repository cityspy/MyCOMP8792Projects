import java.util.Scanner;

public class DrillSimpleIfDifference {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.println("Enter two integers:");
        int first = scan.nextInt();
        int second = scan.nextInt();

        // Check if the first integer is greater than the second
        if (first > second) {
            // Calculate and print the result of first - 17
            int result = first - 17;
            System.out.println(first + " - 17 = " + result);
        } else {
            // Calculate and print the result of second + 17
            int result = second + 17;
            System.out.println(second + " + 17 = " + result);
        }

        // Close the Scanner object
        scan.close();
    }
}
