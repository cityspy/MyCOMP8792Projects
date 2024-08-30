import java.util.Scanner;

/**
 * @author moon0016
 */
public class NumberEvaluation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // prompt the user for a number
        System.out.println("Enter an integer:");
        int number = scan.nextInt();

        // determine whether it is positive, negative, or zero
        if (number > 0) {
            // determine whether it is odd or even
            if (number % 2 == 0) {
                System.out.println("Positive and even");
            } else {
                System.out.println("Positive and odd");
            }
        } else if (number < 0) {
            // Determine if negative number is odd or even
            if (number % 2 == 0) {
                System.out.println("Negative and even");
            } else {
                System.out.println("Negative and odd");
            }
        } else {
            // Number is zero
            System.out.println("Zero and even");
        }
        // output the results
    }
}
