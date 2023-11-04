package Sheet1;

import java.util.Scanner;

public class question19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select your filing status:");
        System.out.println("1 - Single filer");
        System.out.println("2 - Married filing jointly");
        System.out.println("3 - Married filing separately");
        System.out.println("4 - Head of household");
        System.out.print("Enter the number corresponding to your filing status: ");
        int filingStatus = input.nextInt();

        System.out.print("Enter your taxable income: ");
        double income = input.nextDouble();

        input.close();

        double tax = 0.0;

        if (filingStatus == 1) { // Single filer
            tax = calculateSingleFilerTax(income);
        } else if (filingStatus == 2) { // Married filing jointly
            tax = calculateMarriedFilingJointlyTax(income);
        } else if (filingStatus == 3) { // Married filing separately
            tax = calculateMarriedFilingSeparatelyTax(income);
        } else if (filingStatus == 4) { // Head of household
            tax = calculateHeadOfHouseholdTax(income);
        } else {
            System.out.println("Invalid filing status. Please enter a valid option (1-4).");
            return;
        }
        System.out.println("Your federal income tax is: $" + tax);
    }

    public static double calculateSingleFilerTax(double income) {
        return 0.0;
    }

    public static double calculateMarriedFilingJointlyTax(double income) {
        return 0.0;
    }

    public static double calculateMarriedFilingSeparatelyTax(double income) {
        return 0.0;
    }

    public static double calculateHeadOfHouseholdTax(double income) {
        return 0.0;
    }
}
