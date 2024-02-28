package UnitTestHomework;

public class TwoAsOne {
    public static boolean twoAsOne(int a, int b, int c) {
        // Check if it is possible to add two of the ints to get the third
        return (a + b == c) || (b + c == a) || (c + a == b);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(twoAsOne(1, 2, 3));    // true
        System.out.println(twoAsOne(3, 1, 2));    // true
        System.out.println(twoAsOne(3, 2, 2));    // false
    }
}
