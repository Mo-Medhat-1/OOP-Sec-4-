package Sheet1;

import java.util.Scanner;

public class question14 
{
    public static void main(String[] args)    
     {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of the package in pounds: ");
        double weight = input.nextDouble();
        double shippingCost;
        if (weight > 0 && weight <= 2) {
            shippingCost = 2.5;
        } else if (weight > 2 && weight <= 4) {
            shippingCost = 4.5;
        } else if (weight > 4 && weight <= 10) {
            shippingCost = 7.5;
        } else if (weight > 10 && weight <= 20) {
            shippingCost = 10.5;
        } else {
            System.out.println("The package cannot be shipped.");
            return;
        }
        System.out.println("The shipping cost is $" + shippingCost);
        input.close();
    }
}

