package UnittestNg;

import JavaChallenges.testExamples;
import Javachaleenges7.challenge8;
import org.checkerframework.checker.units.qual.Speed;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class unittest {
    @DataProvider(name = "CaughtSpeed")

    public Object[][] testCaughtSpeedData() {
        return new Object[][]{
                {65, true, "No Ticket"},
                {75, false, "Small Ticket"},
                {85, true, "Small Ticket"},
                {55, false, "No Ticket"},

        };
    }

    @Test
            (dataProvider = "CaughtSpeed")
    public void testCaughtSpeed(int speed, boolean isBirthday, String expectedTicket) {
        String actualTicket = challenge8.caughtSpeedinig(speed, isBirthday);
        Assert.assertEquals(actualTicket, expectedTicket);

    }
    @Test
    public void testAdd(){
        int result = testExamples.addition(20,10);
        Assert.assertEquals(result,30,"Test Failed result do not match");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDiv(){
        int result = testExamples.div(10,0);
    }



        }







