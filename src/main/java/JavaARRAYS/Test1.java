package JavaARRAYS;

public class Test1 {

    public static boolean checkSixAtEnds(int[]nums){
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 6};
        boolean result = checkSixAtEnds(myArray);
        System.out.println(result);






    }
}
