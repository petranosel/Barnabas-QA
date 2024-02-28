package TestNGH1;

import UnitTestHomework.cigarParty;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CigarPartyTest {

    @Test(dataProvider = "data")
    public void testCigarParty(int cigars, boolean isWeekend, boolean expected) {
        Assert.assertEquals(cigarParty.cigarParty(cigars, isWeekend), expected);
    }

    @DataProvider(name = "data")
    public Object[][] testData() {
        return new Object[][]{
                {30, false, false},
                {50, false, true},
                {70, true, true},
                {40, false, true},
                {60, false, true},
                {39, true, false},
                // Add more test cases as needed
        };
    }

}
