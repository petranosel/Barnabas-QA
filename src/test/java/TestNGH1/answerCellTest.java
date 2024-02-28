package TestNGH1;

import UnitTestHomework.answerCell;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class answerCellTest {

    @Test(dataProvider = "data")
    public void testAnswerCell(boolean isMorning, boolean isMom, boolean isAsleep, boolean expected) {
        Assert.assertEquals(answerCell.answerCell(isMorning, isMom, isAsleep), expected);
    }

    @DataProvider(name = "data")
    public Object[][] testData() {
        return new Object[][]{
                {false, false, false, true},
                {false, false, true, false},
                {true, false, false, false},
                {true, true, false, true},
                {false, true, true, false},
                {true, true, true, false},
                // Add more test cases as needed
        };
    }


}
