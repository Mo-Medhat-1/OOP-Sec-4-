package Sheet1;

import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2;

        number1 = (int) (Math.random() * 10);

        number2 = (int) (Math.random() * 10);

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        int answer = input.nextInt();

        if (answer == (number1 - number2)) {
            System.out.println("Correct! Good job.");
        } else {
            System.out.println("Incorrect. The correct answer is " + (number1 - number2) + ".");
        }
        input.close();
    }
}
