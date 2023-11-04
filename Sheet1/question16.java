package Sheet1;

import java.util.Scanner;

public class question16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the x-coordinate: ");
        double x = input.nextDouble();

        System.out.print("Enter the y-coordinate: ");
        double y = input.nextDouble();
        input.close();
        double distance = Math.sqrt(x * x + y * y);
        if (distance <= 10.0) {
            System.out.println("The point (" + x + ", " + y + ") is inside the circle.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is outside the circle.");
        }
    }
}
