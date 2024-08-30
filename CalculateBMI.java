// it based on tablular values

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculateBMI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");

        // Prompt the user to enter their weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Prompt the user to enter their height in metres
        System.out.print("Enter your height in metres: ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Format BMI to one decimal place
        String bmiFormatted = df.format(bmi);

        // Determine the BMI category
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25.0) {
            category = "Normal";
        } else if (bmi < 30.0) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        // Display the result
        System.out.println("Your BMI is " + bmiFormatted + ", which means you are in the " + category + " range.");
    }
}


