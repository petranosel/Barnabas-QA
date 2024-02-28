package UnittestNg;

import org.testng.annotations.*;

public class AnnotationsExample {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println(" before Suite");
    }

    @AfterSuite
    public void afterSuit() {
        System.out.println("after Suit");
    }


    @BeforeTest
    public void beforeTest() {
        System.out.println("before Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("after Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("before Class ");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("after Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("after Method");
    }

    @Test
    public void test1() {
        System.out.println("test 1");
    }

    @Test
    public void test2() {
        System.out.println("test 2");

    }

    @Test
    public void test3() {
        System.out.println("test 3");

    }

    @Test
    public void test4() {
        System.out.println("test 4");
    }
}