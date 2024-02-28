package TestNGH1;

import UnitTestHomework.CodeThree1;
import UnitTestHomework.CodeTwo;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCodeThree {
    @Test
    @Parameters({"a", "b"})

    public void testcodethree(int a, int b) {
        int ExpectedResult = 0;
        int result = CodeThree1.mod(a, b);
        assert result == ExpectedResult : "expected" + ExpectedResult + "But Got" + result;
    }
}