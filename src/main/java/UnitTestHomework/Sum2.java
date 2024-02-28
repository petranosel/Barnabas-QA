package UnitTestHomework;

public class Sum2 {
    public static int sum2(int[] nums) {
        // If the array length is less than 2, sum up all the elements, returning 0 if the array is empty
        if (nums.length < 2) {
            return nums.length > 0 ? nums[0] : 0;
        }
        // Sum up the first 2 elements in the array
        return nums[0] + nums[1];
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(sum2(new int[]{1, 2, 3}));      // 3
        System.out.println(sum2(new int[]{1, 1}));          // 2
        System.out.println(sum2(new int[]{1, 1, 1, 1}));    // 2
        System.out.println(sum2(new int[]{}));              // 0

    }
}

