package Sheet1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year (e.g., 2023): ");
        int year = input.nextInt();

        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter the day of the month: ");
        int day = input.nextInt();

        input.close();

        Calendar calendar = new GregorianCalendar(year, month - 1, day); // Note: Month is zero-based

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        String dayOfWeekName = getDayOfWeekName(dayOfWeek);

        System.out.println("The day of the week for " + month + "/" + day + "/" + year + " is " + dayOfWeekName);
    }

    public static String getDayOfWeekName(int dayOfWeek) {
        String[] daysOfWeek = {
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };

        return daysOfWeek[dayOfWeek - 1];
    }
}
