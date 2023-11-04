package Sheet1;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");
        int number = scanner.nextInt();

        int product = multiplyDigits(number);
        System.out.println(product);

        scanner.close();
    }

    public static int multiplyDigits(int number) {
        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            product *= digit;
            number /= 10;
        }
        return product;
    }

}
