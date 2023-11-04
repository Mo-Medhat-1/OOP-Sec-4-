package Sheet1;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the sides and height of the equilateral triangle: ");
        double LengthOfSides = scanner.nextDouble();
        double area = (Math.pow(3, (0.5)) / 4) * Math.pow(LengthOfSides, 2);
        double volume = area * LengthOfSides;
        System.out.println("The area is: " + area);
        System.out.println("The Volume of the triangular prism is : " + volume);
        scanner.close();
    }
}
