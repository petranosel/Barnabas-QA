package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Cucumber/", 
        glue = "Cucumber",
        plugin = {"pretty","html:test-output/cucumber-report.html"}


)
public class TestRunner extends AbstractTestNGCucumberTests {


}
