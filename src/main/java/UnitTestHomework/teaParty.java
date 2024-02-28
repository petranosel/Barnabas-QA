package UnitTestHomework;

public class teaParty {
    public static int teaParty(int tea, int candy) {
        // Check if either tea or candy is less than 5
        if (tea < 5 || candy < 5) {
            return 0; // Party is bad
        }

        // Check if both tea and candy are at least 5
        if (tea >= 5 && candy >= 5) {
            // Check if either tea or candy is at least double the amount of the other one
            if (tea >= 2 * candy || candy >= 2 * tea) {
                return 2; // Party is great
            } else {
                return 1; // Party is good
            }
        }

        return 0; // Default case (should not reach here)
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(teaParty(6, 8));    // 1
        System.out.println(teaParty(3, 8));    // 0
        System.out.println(teaParty(20, 6));   // 2
    }

}
