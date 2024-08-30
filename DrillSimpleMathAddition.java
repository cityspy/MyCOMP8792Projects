import java.util.Scanner;

public class DrillSimpleMathAddition {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Enter an integer:\n");
        int inputNumber = scan.nextInt();

        // Perform the addition
        int result = inputNumber + 29;

        // Output the result
        System.out.println(inputNumber +" + 29 = " + result);

        // Close the scanner
        scan.close();
    }

}
