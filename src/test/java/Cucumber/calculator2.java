//package Cucumber;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//
//public class calculator2 {
//    private WebDriver driver;
//    private WebDriverWait wait;
//
//    @Given("I have calculator page open")
//    public void iHaveCalculatorPageOpen() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
////         = new WebDriverWait(driver,10);
//        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//
//        driver.get("https://www.google.com/");
//
//    }
//
//    @When("I add {int} and {int}")
//    public void iAddAnd(int num1, int num2) {
//        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.sendKeys("calculator");
//        searchBox.sendKeys(Keys.ENTER);
//
//         //Wait for the calculator to appear in the search results
//        WebElement calculatorLink = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("h3[data-attrid='calculator']")));
//        calculatorLink.click();
//
//        // Perform the addition operation
//        WebElement result = performOperation(num1 + " + " + num2);
//        assertResult(result, num1 + num2);
//    }
//
//
//    @When("I subtract {int} and {int}")
//    public void iSubtractAnd(int num1, int num2) {
//        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.sendKeys("calculator");
//        searchBox.sendKeys(Keys.ENTER);
//
//        // Wait for the calculator to appear in the search results
//        WebElement calculatorLink = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("h3[data-attrid='calculator']")));
//        calculatorLink.click();
//
//        // Perform the subtraction operation
//        WebElement result = performOperation(num1 + " - " + num2);
//        assertResult(result, num1 - num2);
//    }
//
//    private WebElement performOperation(String operation) {
//        WebElement calculatorInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".WFnNle input")));
//        calculatorInput.sendKeys(operation);
//        calculatorInput.sendKeys(Keys.ENTER);
//
//        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cwos")));
//    }
//
//    private void assertResult(WebElement resultElement, int expectedResult) {
//        int actualResult = Integer.parseInt(resultElement.getText().replace(",", ""));
//        assert actualResult == expectedResult : "Result is not as expected";
//    }
//
//    @Then("the result is displayed")
//    public void theResultIsDisplayed() {
//        // No additional action needed as result validation is done in the previous steps
//        driver.quit();
//    }
//}
//
//
