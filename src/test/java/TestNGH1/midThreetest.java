package TestNGH1;

import UnitTestHomework.midThree;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class midThreetest {
    @Test(dataProvider = "data")
    public void testMidThree(int[] input, int[] expected) {
        Assert.assertEquals(midThree.midThree(input), expected );
    }

    @DataProvider(name = "data")
    public Object[][] testData() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4, 5}, new int[]{2, 3, 4}},
                {new int[]{8, 6, 7, 5, 3, 0, 9}, new int[]{7, 5, 3}},
                {new int[]{1, 2, 3}, new int[]{1, 2, 3}},
                // Add more test cases as needed
        };
    }
}
