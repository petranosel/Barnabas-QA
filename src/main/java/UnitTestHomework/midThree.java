package UnitTestHomework;

import java.util.Arrays;

public class midThree {
    public static int[] midThree(int[] nums) {
        int middleIndex = nums.length / 2;
        return Arrays.copyOfRange(nums, middleIndex - 1, middleIndex + 2);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(Arrays.toString(midThree(new int[]{1, 2, 3, 4, 5})));            // [2, 3, 4]
        System.out.println(Arrays.toString(midThree(new int[]{8, 6, 7, 5, 3, 0, 9})));    // [7, 5, 3]
        System.out.println(Arrays.toString(midThree(new int[]{1, 2, 3})));                 // [1, 2, 3]
    }
}