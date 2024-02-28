package TestNGH1;

import UnitTestHomework.CodeTwo;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCodetwo {

    @Test//(dependsOnMethods = "testcodetwoDivide")
    @Parameters({"a", "b"})
    public void testcodetwoAdd(int a, int b) {
        int ExpectedResult = 20;
        int result = CodeTwo.add(a, b);
        assert result == ExpectedResult : "expected" + ExpectedResult + "But Got" + result;
    }

    @Test(priority = 1)
    @Parameters({"a", "b"})
    public void testcodetwoDivide(int a, int b) {
        int ExpectedResult = 1;
        int result = CodeTwo.divide(a, b);
        assert result == ExpectedResult : "expected" + ExpectedResult + "But Got" + result;


    }

    @Test
    @Parameters({"a", "b"})
    public void multiply(int a, int b) {
        int ExpectedResult = 100;
        int result = CodeTwo.multiply(a, b);
        assert result == ExpectedResult : "expected" + ExpectedResult + "But Got" + result;

    }}