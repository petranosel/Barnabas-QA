package TestNGH1;

import UnitTestHomework.TwoAsOne;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.PriorityQueue;

public class TwoAsOnetest {

    @Test(dataProvider = "data")

    public void testTwoAsOne(int a, int b, int c, boolean expected) {
        Assert.assertEquals(TwoAsOne.twoAsOne(a, b, c), expected);
    }

    @DataProvider(name = "data")
    public Object[][] testData() {
        return new Object[][]{
                {1, 2, 3, true},
                {3, 1, 2, true},
                {3, 2, 2, false},
                {5, 7, 12, true},
                {8, 4, 4, false},
                {0, 0, 0, true},
                // Add more test cases as needed
        };
    }

}
