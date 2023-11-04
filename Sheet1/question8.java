package Sheet1;

import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter the number of years: ");
        int numberOfYears = input.nextInt();

        input.close();

        double monthlyInterestRate = annualInterestRate / 100 / 12;

        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

        System.out.printf("The future investment value is: %.2f%n", futureInvestmentValue);
    }
}
