package UnitTestHomework;

public class teenSum {
    public static int teenSum(int a, int b) {
        // Check if either value is a teen (in the range 13..19 inclusive)
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        } else {
            // If neither value is a teen, return their sum
            return a + b;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(teenSum(3, 4));     // 7
        System.out.println(teenSum(10, 13));   // 19
        System.out.println(teenSum(13, 2));    // 19
    }
}
