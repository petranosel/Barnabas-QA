package UnitTestHomework;

public class answerCell {
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        // Check if you are asleep, return false
        if (isAsleep) {
            return false;
        }

        // Check if it's morning and not your mom calling, return false
        if (isMorning && !isMom) {
            return false;
        }

        // In all other cases, answer the call
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(answerCell(false, false, false));   // true
        System.out.println(answerCell(false, false, true));    // false
        System.out.println(answerCell(true, false, false));    // false

    }}
