package TestNGH1;

import UnitTestHomework.teaParty;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class teaPartytest {
    @Test(dataProvider = "data")
    public void testTeaParty(int tea, int candy, int expected) {
        Assert.assertEquals(teaParty.teaParty(tea, candy), expected);
    }

    @DataProvider(name = "data")
    public Object[][] testData() {
        return new Object[][]{
                {6, 8, 1},
                {3, 8, 0},
                {20, 6, 2},
                {2, 10, 0},
                {5, 5, 1},
                {10, 5, 2},
                {5, 10, 2},
                // Add more test cases as needed
        };
    }

}
