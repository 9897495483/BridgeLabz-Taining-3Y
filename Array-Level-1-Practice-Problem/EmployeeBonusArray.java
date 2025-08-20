import java.util.Scanner;

public class EmployeeBonusArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            double sal = sc.nextDouble();
            System.out.print("Enter years of service: ");
            double yr = sc.nextDouble();

            if (sal <= 0 || yr < 0) {
                System.out.println("Invalid input. Try again!");
                i--; // redo this employee
                continue;
            }

            salary[i] = sal;
            years[i] = yr;
        }

        // Calculation
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + " Old Salary: " + salary[i] +
                               " Bonus: " + bonus[i] +
                               " New Salary: " + newSalary[i]);
        }
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
