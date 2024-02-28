package Cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class YahooNewsSteps {
    private WebDriver driver;

    @Given("I am on the Google homepage")
    public void iAmOnGoogleHomepage() {

        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @When("I search for yahoo and click on the Yahoo homepage link")
    public void searchAndClickYahooHomepage() {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("yahoo home page");
        searchBox.sendKeys(Keys.RETURN);

        WebElement yahooLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3"));
        yahooLink.click();
    }

    @And("I scroll down on the Yahoo homepage")
    public void scrollDownOnYahooHomepage() {

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript(("window.scrollBy(0, 500);"));


    }

    @And("I click on a news link")
    public void clickOnNewsLink() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement newsLink = driver.findElement(By.xpath("//*[@id=\"module-stream\"]/ul/li[1]/div[1]/div[2]/h3/a/u"));
        newsLink.click();
    }

    @Then("the news link should be working")
    public void verifyNewsLink() {
        String ExpectedTitle = driver.getTitle();
        String ActualTitle = "MAGA Trucker Does A 180 After Trying To Start A Boycott Of NYC Over Donald Trump’s $355M Fine";
  Assert.assertEquals(ExpectedTitle,ActualTitle);

  driver.quit();
    }

    }