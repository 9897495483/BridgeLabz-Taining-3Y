import java.util.Scanner;

public class BMI2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // [weight, height, BMI]
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) of person " + (i+1) + ": ");
            double w = sc.nextDouble();
            System.out.print("Enter height (m) of person " + (i+1) + ": ");
            double h = sc.nextDouble();

            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = w / (h * h);

            if (personData[i][2] < 18.5) weightStatus[i] = "Underweight";
            else if (personData[i][2] < 24.9) weightStatus[i] = "Normal";
            else if (personData[i][2] < 29.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i+1) + " Height: " + personData[i][1] +
                               " Weight: " + personData[i][0] +
                               " BMI: " + personData[i][2] +
                               " Status: " + weightStatus[i]);
        }
    }
}
