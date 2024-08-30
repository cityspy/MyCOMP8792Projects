import java.util.Scanner;
import java.text.NumberFormat;


public class Annuities {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Declare variables
        double PMT;
        double interestRate;
        int numberOfPayments;
        double presentValue;

        // Prompt for the PMT value
        System.out.print("Enter the PMT value:\n");
        PMT = scan.nextDouble();

        // Prompt for the interest rate
        System.out.print("Enter the interest rate:\n");
        interestRate = scan.nextDouble();

        // Convert interest rate from percentage to decimal
        double i = interestRate / 100;

        // Prompt for the number of payments
        System.out.print("Enter the number of payments:\n");
        numberOfPayments = scan.nextInt();

        // Calculate the present value of the annuity
        double numerator = Math.pow(1 + i, numberOfPayments) - 1;
        double denominator = i * Math.pow(1 + i, numberOfPayments);
        presentValue = PMT * (numerator / denominator);

        // Format the result as currency
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        String formattedValue = currencyFormat.format(presentValue);

        // Output the result
        System.out.println("Present Value of the annuity is: " + formattedValue);

        // Close the scanner
        scan.close();
    }
}
