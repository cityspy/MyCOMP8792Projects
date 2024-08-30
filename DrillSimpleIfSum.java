import java.util.Scanner;

public class DrillSimpleIfSum {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.println("Enter two integers:");
        int first = scan.nextInt();
        int second = scan.nextInt();

        // Compare the integers and perform the appropriate operation
        if (first < second) {
            // If the first integer is less than the second
            int result = first + 51;
            System.out.println(first + " + 51 = " + result);
        } else {
            // If the first integer is not less than the second
            int result = second - 51;
            System.out.println(second + " - 51 = " + result);
        }

        // Close the Scanner object
        scan.close();
    }
}
