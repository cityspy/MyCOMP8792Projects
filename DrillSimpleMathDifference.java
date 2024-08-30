import java.util.Scanner;

public class DrillSimpleMathDifference {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Enter an integer:\n");
        int inputNumber = scan.nextInt();

        // Calculate the difference
        int result = inputNumber - (-82); // Subtracting -82 is the same as adding 82

        // Output the result
        System.out.println(inputNumber +" - -82 = " + result);

        // Close the scanner
        scan.close();

    }

}
