package Sheet1;

import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        System.out.print("Enter your weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter your height in inches: ");
        double heightInInches = input.nextDouble();

        double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
        double heightInMeters = heightInInches * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.println("Your BMI is: " + bmi);
        System.out.print("Interpretation: ");

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        input.close();
    }
}
