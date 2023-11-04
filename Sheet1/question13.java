package Sheet1;

import java.util.Scanner;

public class question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        input.close();

        if (number < 100 || number > 999) {
            System.out.println("Please enter a valid three-digit integer.");
        } else {
            int originalNumber = number;
            int digit1 = number % 10;
            number /= 10;
            int digit2 = number % 10;
            number /= 10;
            int digit3 = number;

            if (digit1 == digit3) {
                System.out.println(originalNumber + " is a palindrome integer.");
            } else {
                System.out.println(originalNumber + " is not a palindrome integer.");
            }
        }
    }
}
