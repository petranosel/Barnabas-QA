package UnitTestHomework;

public class Sum3 {
    public static int sum3(int[] nums) {
        if (nums == null || nums.length != 3) {
            throw new IllegalArgumentException("Array must be non-null and have a length of 3");
        }

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example usage with exceptions
        try {
            int[] nums1 = {1, 2, 3};
            int result1 = sum3(nums1);
            System.out.println(result1);  // Output: 6

            int[] nums2 = {5, 11, 2};
            int result2 = sum3(nums2);
            System.out.println(result2);  // Output: 18

            // Uncomment the next line to see an exception being thrown
             int[] nums3 = {7, 0, 0, 4};
            int result3 = sum3(nums3);
        } catch (IllegalArgumentException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}