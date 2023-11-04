package Sheet1;

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        long minutesPerDay = 24 * 60;
        long minutesPerYear = 365 * minutesPerDay;

        long years = minutes / minutesPerYear;
        long remainingMinutes = minutes % minutesPerYear;
        long days = remainingMinutes / minutesPerDay;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

        scanner.close();
    }
}
