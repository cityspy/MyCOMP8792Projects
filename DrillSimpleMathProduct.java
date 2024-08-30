import java.util.Scanner;

public class DrillSimpleMathProduct {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Enter an integer:\n");
        int inputNumber = scan.nextInt();

        // Perform the multiplication
        int result = inputNumber * -56;

        // Output the result
        System.out.println(inputNumber + " * -56 = " + result);

        // Close the scanner
        scan.close();
    }

}
