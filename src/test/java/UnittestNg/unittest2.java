package UnittestNg;

import JavaChallenges.testExamples;
import org.testng.Assert;
import org.testng.annotations.Test;

public class unittest2 {
@Test(dependsOnMethods = {"testStringCheckTwo"})
public void testStringCheck(){
    Assert.assertTrue(testExamples.checkString().contains("Hello World"));
    Assert.assertFalse(testExamples.checkString().isEmpty(),"String is Empty");
    Assert.assertEquals(testExamples.checkString().length(),11);
}
@Test
    public void testStringChecktwo () {
    Assert.assertTrue(testExamples.checkString().contains("Hello World"));
    Assert.assertFalse(testExamples.checkString().isEmpty(),"String is Empty");
    Assert.assertEquals(testExamples.checkString().length(),10);
}



}


