package Cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CalculatorSteps {
    WebDriver driver;

    @Given("I have calculator page open")
    public void Ihavecalculatorpageopen() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.calculatorsoup.com/calculators/math/basic.php");


    }

    @When("^the (\\d+) is displayed$")
    public void iAdd(int num1, int num2) throws Throwable {
        WebElement num1Field = driver.findElement(By.xpath("//*[@id=\"cs_display\"]"));
        num1Field.sendKeys(String.valueOf(num1));
        WebElement addButton = driver.findElement(By.xpath("//*[@id=\"cs_calculator_form\"]/table/tbody/tr[6]/td[4]/button"));
        addButton.click();

        WebElement num2Field = driver.findElement(By.xpath(""));
        num2Field.sendKeys(String.valueOf(num2));
        WebElement EqualButton = driver.findElement(By.xpath("//*[@id=\"cs_calculator_form\"]/table/tbody/tr[7]/td[4]/button"));
        EqualButton.click();
    }


    @Then("the result should be (\\d+)S")
    public void theResultisdisplayed(int expectedResult) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement resultField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));


        String actualResultStr = (String) ((JavascriptExecutor) driver).executeScript("return argument[0].valu;", resultField);
        int actualResult = Integer.parseInt(actualResultStr);
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result");
    }

    @Then("close the browser")
    public void closebrowser() throws Throwable {


        driver.quit();
    }

}
