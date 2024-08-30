import java.util.Scanner;

public class DrillSleepPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values for A, B, and H
        System.out.println("Enter the minimum hours required (A):");
        int A = scan.nextInt();

        System.out.println("Enter the maximum hours allowed (B):");
        int B = scan.nextInt();

        System.out.println("Enter the actual hours slept (H):");
        int H = scan.nextInt();

        // Determine if Ann's sleep schedule is normal, deficient, or excessive
        if (H < A) {
            System.out.println("Deficiency");
        } else if (H > B) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }

        // Close the scanner
        scan.close();
    }
}
