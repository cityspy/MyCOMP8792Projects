import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstmessage;
        String secondMessage;

        System.out.println("Enter a line of text:");
        firstmessage = scan.nextLine();

        System.out.println("Enter another line of text:");
        secondMessage = scan.nextLine();

        System.out.println("You entered " + secondMessage + ", " + firstmessage);
    }
}
