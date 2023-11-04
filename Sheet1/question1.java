package Sheet1;

public class question1 {
    public static void main(String[] args) {
        double miles = 24.0;
        int hours = 1;
        int minutes = 40;
        int seconds = 35;

        double kilometers = miles * 1.6;
        double fulltime = hours + (minutes / 60) + (seconds / 3600);
        double averageSpeed = kilometers / fulltime;
        System.out.println("Average speed: " + averageSpeed + " kilometers per hour");
    }
}
