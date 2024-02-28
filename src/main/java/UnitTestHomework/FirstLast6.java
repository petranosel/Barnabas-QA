package UnitTestHomework;

public class FirstLast6 {
    public static boolean firstLast6(int[] nums) {
        // Check if the array is not empty
        if (nums.length >= 1) {
            // Check if 6 appears as either the first or last element
            return nums[0] == 6 || nums[nums.length - 1] == 6;
        }
        // If the array is empty, return false
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(firstLast6(new int[]{1, 2, 6}));          // true
        System.out.println(firstLast6(new int[]{6, 1, 2, 3}));       // true
        System.out.println(firstLast6(new int[]{13, 6, 1, 2, 3}));   // f

    }
}