import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void generateException(String str) {
        System.out.println("Generating Exception...");
        char ch = str.charAt(str.length()); 
        System.out.println("Character at invalid index: " + ch);
    }

    public static void handleException(String str) {
        System.out.println("\nHandling Exception with try-catch...");
        try {
            char ch = str.charAt(str.length()); 
            System.out.println("Character at invalid index: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        try {
            generateException(input);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Program stopped abruptly in generateException() due to: " + e);
        }

        handleException(input);
        sc.close();
    }
}
