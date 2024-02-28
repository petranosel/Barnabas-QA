package TestNGH1;

import UnitTestHomework.teenSum;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class teenSumTest {

        @Test(dataProvider = "data")
        public void testTeenSum(int a, int b, int expected) {
            Assert.assertEquals(teenSum.teenSum(a, b),expected);
        }

        @DataProvider(name = "data")
        public Object[][] testData() {
            return new Object[][]{
                    {3, 4, 7},
                    {10, 13, 19},
                    {13, 2, 19},
                    {15, 17, 19},
                    {8, 8, 16},
                    {18, 19, 19},
                    // Add more test cases as needed
            };
        }
}