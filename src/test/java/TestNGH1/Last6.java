package TestNGH1;

import UnitTestHomework.FirstLast6;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Last6 {
    @Test(dataProvider = "data")
    public void testFirstLast6(int[] nums, boolean expected) {
        Assert.assertEquals(FirstLast6.firstLast6(nums),expected);

    }

    @DataProvider(name = "data")
    public Object[][] testData() {
        return new Object[][]{
                {new int[]{1, 2, 6}, true},
                {new int[]{6, 1, 2, 3}, true},
                {new int[]{13, 6, 1, 2, 3}, false},
                {new int[]{}, false},
                {new int[]{6}, true},
                {new int[]{5, 6}, true},
                {new int[]{5, 5, 6}, true},
                {new int[]{5, 5, 5}, false},
                {new int[]{7, 8, 9}, false}
        };
    }

}
