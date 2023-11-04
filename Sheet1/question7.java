package Sheet1;

import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the x-coordinate of the first point (x1): ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of the first point (y1): ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter the x-coordinate of the second point (x2): ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of the second point (y2): ");
        double y2 = scanner.nextDouble();
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the two points is: " + distance);

        scanner.close();
    }
}
