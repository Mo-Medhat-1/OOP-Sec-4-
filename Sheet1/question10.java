package Sheet1;

import java.util.Random;

public class question10 {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(12) + 1;

        String monthName = getMonthName(randomNumber);
        System.out.println("The randomly generated number is " + randomNumber);
        System.out.println("The corresponding month is " + monthName);
    }

    public static String getMonthName(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid Month";
        }
    }
}
