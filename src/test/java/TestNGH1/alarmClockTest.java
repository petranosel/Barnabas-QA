package TestNGH1;

import UnitTestHomework.alarmClock;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class alarmClockTest {
    @Test(dataProvider = "data")
    public void testAlarmClock(int day, boolean vacation, String expected) {
        Assert.assertEquals(alarmClock.alarmClock(1, false), "7:00");
    }

    @DataProvider(name = "data")
    public Object[][] testData() {
        return new Object[][]{
                {1, false, "7:00"},
                {5, false, "7:00"},
                {0, false, "10:00"},
                {2, true, "10:00"},
                {6, true, "off"},
                {3, false, "7:00"},
                // Add more test cases as needed
        };
    }




}
