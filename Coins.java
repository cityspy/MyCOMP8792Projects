import java.util.Scanner;

class Coins {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.print("Enter an amount of cents in the range 0 to 100: ");
        num = scan.nextInt();
        // output goes here
        int twentyCentCoins = num / 20;
        num = num % 20;
        int fiveCentCoins = num / 5;
        int oneCentCoins = num % 5;

        System.out.println("Dispensing...");
        System.out.println(twentyCentCoins + " 20c coin(s)");
        System.out.println(fiveCentCoins + " 5c coin(s)");
        System.out.println(oneCentCoins + " 1c coin(s)");
    }
}
