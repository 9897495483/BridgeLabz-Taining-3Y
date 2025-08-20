import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        System.out.print("Enter numbers (0 to stop): ");
        double number = sc.nextDouble();

        while (number != 0) {
            total += number;
            number = sc.nextDouble();
        }
        System.out.println("Total = " + total);
    }
}
