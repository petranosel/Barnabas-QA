package UnitTestHomework;

public class cigarParty {

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        // Check if the party is successful based on the given conditions
        if (isWeekend) {
            // Weekend party has no upper bound on the number of cigars
            return cigars >= 40;
        } else {
            // Weekday party should have cigars between 40 and 60, inclusive
            return cigars >= 40 && cigars <= 60;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(cigarParty(30, false));   // false
        System.out.println(cigarParty(50, false));   // true
        System.out.println(cigarParty(70, true));    // true
    }
}
