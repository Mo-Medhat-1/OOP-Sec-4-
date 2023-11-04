package Sheet1;

import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("your weight in pounds: ");
        double weightInPounds = scanner.nextDouble();
        System.out.print("your height in inches: ");
        double heightInInches = scanner.nextDouble();
        double weightInKilograms = weightInPounds * 0.45359237;
        double heightInMeters = heightInInches * 0.0254;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.println("Your BMI is: " + bmi);

        scanner.close();
    }
}
