package Sheet1;

import java.util.Scanner;

public class question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the first edge: ");
        double edge1 = input.nextDouble();

        System.out.print("Enter the length of the second edge: ");
        double edge2 = input.nextDouble();

        System.out.print("Enter the length of the third edge: ");
        double edge3 = input.nextDouble();

        input.close();

        if (isValidTriangle(edge1, edge2, edge3)) {
            double perimeter = edge1 + edge2 + edge3;
            System.out.println("The perimeter of the triangle is: " + perimeter);
        } else {
            System.out.println("The input is invalid. It does not form a valid triangle.");
        }
    }

    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
