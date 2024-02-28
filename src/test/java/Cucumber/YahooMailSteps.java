package Cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class YahooMailSteps {

private WebDriver driver;

 @Given("The user is on the yahoo home page")
    public void theuserIsOnTheYahooHomepage(){
     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
     driver.get("https://www.yahoo.com");
 }
@When("The user clicks on the Mail link")
    public void  theuserclicksonthemaillink(){

    WebElement maillink = driver.findElement(By.xpath("//*[@id=\"login-container\"]/a"));
    maillink.click();
}
@Then("The mail page is displayed")
public  void themailpageisdisplayed() {
    String expectedTitle = "Yahoo";
    Assert.assertTrue(driver.getTitle().contains(expectedTitle),"the title is not found");
driver.quit();
 }
}
//Feature: yahoo Mail Access
//
//Scenario: open yahoo and  click mail link
//
//        Given The user is on the yahoo home page
//        When The user clicks on the Mail link
//        Then The mail page is displayed
//