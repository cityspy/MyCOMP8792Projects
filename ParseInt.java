import java.util.Scanner;

public class ParseInt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstMessage;
        String secondMessage;

        System.out.println("Enter a line of text:");
        firstMessage = scan.nextLine();

        System.out.println("Enter another line of text:");
        secondMessage = scan.nextLine();

        String completeNumberString = firstMessage + secondMessage;
        int completeNumber = Integer.parseInt(completeNumberString);

        int resultNumber = completeNumber + 1;

        System.out.println("The complete number is " + completeNumber + " and adding 1 gives " + resultNumber);
        scan.close();
    }
}
