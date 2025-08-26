import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void generateException(String str) {
        System.out.println("Generating Exception...");
        String sub = str.substring(5, 2);  // start > end → IllegalArgumentException
        System.out.println("Substring: " + sub);
    }

    public static void handleException(String str) {
        System.out.println("\nHandling Exception with try-catch...");
        try {
            String sub = str.substring(5, 2);
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        try {
            generateException(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Program stopped abruptly in generateException() due to: " + e);
        }

        handleException(input);
        sc.close();
    }
}
