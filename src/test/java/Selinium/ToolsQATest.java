package Selinium;
import com.beust.jcommander.Parameter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
public class ToolsQATest {
    private WebDriver driver;
    private WebDriverWait wait;
@Parameter(names="browser")
    @BeforeClass
    public void setUp(String browser){
       if (browser.equalsIgnoreCase("chrome")) {
           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
       } else if (browser.equalsIgnoreCase("firefox")) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
       }
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void testFormQA(){
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement name = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[1]/div[2]/input"));
        name.sendKeys("ABCD");

        WebElement lastname = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[1]/div[4]/input"));
        lastname.sendKeys("EFGH");

        WebElement email = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[2]/div[2]/input"));
        email.sendKeys("ABC.DEF@Example.com");


        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/div[2]/div[1]/label[1]"))));
        WebElement gender = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/div[2]/div[1]/label[1]"));
        gender.click();

        WebElement phone = driver.findElement(By.xpath("//*[@id=\"userNumber\"]"));
        phone.sendKeys("1234567890");

        wait.until(ExpectedConditions.elementToBeClickable(By.className("react-datepicker__input-container")));
        WebElement DOB = driver.findElement(By.className("react-datepicker__input-container"));
        DOB.click();

        Select monthSelect = new Select(driver.findElement(By.className("react-datepicker__month-select")));
        monthSelect.selectByVisibleText("May");

        Select yearSelect = new Select(driver.findElement(By.className("react-datepicker__year-select")));
        yearSelect.selectByVisibleText("1990");


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[3]")));
        WebElement day = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[3]"));
        day.click();

        WebElement subject = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[6]/div[2]/div/div/div[1]/div[2]/div/input"));
        subject.sendKeys("Math");
        subject.sendKeys(Keys.ENTER);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[7]/div[2]/div[1]"))));
        WebElement hobby = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[7]/div[2]/div[1]"));
        hobby.click();

        WebElement address = driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
        address.sendKeys("123 Main St");


        WebElement stateDropdown = driver.findElement(By.id("state"));
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", stateDropdown);

        driver.findElement(By.id("state")).click();
        driver.findElement(By.id("react-select-3-option-0")).click();


        wait.until(ExpectedConditions.elementToBeClickable(By.id("city")));
        driver.findElement(By.id("city")).click();
        driver.findElement(By.id("react-select-4-option-0")).click();




    }

    @AfterClass
    public void cleanUp(){
        if (driver != null){
            driver.quit();
        }
    }
}

