import java.util.Scanner;
import java.text.DecimalFormat;

public class DrillAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.#"); // Format to up to 1 decimal place

        // Prompt the user for 5 assignment scores
        System.out.println("Assign 1 score:");
        int score1 = scan.nextInt();
        System.out.println("Assign 2 score:");
        int score2 = scan.nextInt();
        System.out.println("Assign 3 score:");
        int score3 = scan.nextInt();
        System.out.println("Assign 4 score:");
        int score4 = scan.nextInt();
        System.out.println("Assign 5 score:");
        int score5 = scan.nextInt();

        // Calculate the average score
        double average = (score1 + score2 + score3 + score4 + score5) / 5.0;

        // Display the average score formatted to up to 1 decimal place
        System.out.println("Your average score is " + df.format(average));

        // Close the scanner
        scan.close();
    }
}
