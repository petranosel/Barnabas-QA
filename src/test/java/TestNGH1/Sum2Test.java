package TestNGH1;

import UnitTestHomework.Sum2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sum2Test {

    @Test(dataProvider = "data")
    public void testSum2(int[] nums, int expected) {
        Assert.assertEquals(Sum2.sum2(nums), expected);
    }

    @DataProvider(name = "data")
    public Object[][] testData() {
        return new Object[][]{
                {new int[]{1, 2, 3}, 3},
                {new int[]{1, 1}, 2},
                {new int[]{1, 1, 1, 1}, 2},
                {new int[]{}, 0},
                {new int[]{5}, 5},
                {new int[]{0, 0}, 0},
                {new int[]{-1, 1}, 0},
                // Add more test cases as needed
        };
    }


}
