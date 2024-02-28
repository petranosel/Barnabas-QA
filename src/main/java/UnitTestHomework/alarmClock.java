package UnitTestHomework;

public class alarmClock {
    public static String alarmClock(int day, boolean vacation) {
        // Check if we are on vacation
        if (vacation) {
            // Check if it's a weekday or weekend and return the appropriate alarm time
            if (day >= 1 && day <= 5) {
                return "10:00"; // Weekday
            } else {
                return "off";   // Weekend
            }
        } else {
            // Not on vacation, check if it's a weekday or weekend and return the appropriate alarm time
            if (day >= 1 && day <= 5) {
                return "7:00";  // Weekday
            } else {
                return "10:00"; // Weekend
            }
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(alarmClock(1, false));   // "7:00"
        System.out.println(alarmClock(5, false));   // "7:00"
        System.out.println(alarmClock(0, false));   // "10:00"
    }
}
