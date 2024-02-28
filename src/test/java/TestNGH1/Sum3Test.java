package TestNGH1;

import UnitTestHomework.Sum3;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sum3Test {

    @Test(dataProvider = "data")
    public void testSum3(int[] nums, int expected) {
        Assert.assertEquals(Sum3.sum3(nums), expected);
    }

    @DataProvider(name = "data")
    public Object[][] testData() {
        return new Object[][]{
                {new int[]{1, 2, 3}, 6},
                {new int[]{5, 11, 2}, 18},
                {new int[]{7, 0, 0}, 7},
                {new int[]{6,8,0}, 13},
                {new int[]{10, -5, 3}, 8},
                {new int[]{-1, -2, -3}, -6},
                {new int[]{8, 8, 8}, 24},
                {new int[]{1, 2, 1}, 4},
                {new int[]{9, -3, 1}, 7}
        };
    }

}
