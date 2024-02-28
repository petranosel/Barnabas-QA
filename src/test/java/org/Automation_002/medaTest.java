package org.Automation_002;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.Automation_002.meda.Grade;
import static org.testng.Assert.*;

public class medaTest {

    @Test(dataProvider = "gradeData")
    public void testGrade(int average, String expectedGrade) {
        Assert.assertEquals(Grade(average), expectedGrade);
       String actualGrade= meda.Grade(average);
    }

    @DataProvider(name = "gradeData")
    public Object[][] gradeData() {
        return new Object[][]{
                {95, "A"},
                {90, "A"},
                {89, "B"},
                {80, "B"},
                {79, "C"},
                {70, "C"},
                {69, "D"},
                {60, "D"},
                {59, "fail"},
                {0, "fail"}
        };
    }
}
