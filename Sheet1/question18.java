package Sheet1;

import java.util.Scanner;

public class question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        input.close();

        boolean isDivisibleBy4And5 = (number % 4 == 0) && (number % 5 == 0);
        boolean isDivisibleBy4Or5 = (number % 4 == 0) || (number % 5 == 0);
        boolean isDivisibleBy4Or5ButNotBoth = (number % 4 == 0) ^ (number % 5 == 0);

        System.out.println("Is the number divisible by 4 and 5? " + isDivisibleBy4And5);
        System.out.println("Is the number divisible by 4 or 5? " + isDivisibleBy4Or5);
        System.out.println("Is the number divisible by 4 or 5 but not both? " + isDivisibleBy4Or5ButNotBoth);
    }
}
