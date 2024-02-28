package Selinium;

import com.beust.jcommander.Parameter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestONE {
    private WebDriver driver;

   // @Parameter(names = browser)
    @BeforeClass

    public void SetUp(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void openGoogleTest() {
        driver.get("https://www.google.com");
        WebElement searchbox = driver.findElement(By.className("gLFyf"));
        searchbox.click();
        searchbox.sendKeys("QA Automation");
        searchbox.submit();
        String expectedTitle = "QA Automation - Google Search";
        Assert.assertTrue(driver.getTitle().contains(expectedTitle), "Search result page not expected");
    }

    @Test(dependsOnMethods = "openGoogleTest")
    public void navigateTutorial() {
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement firstlink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div/div/div[1]/div/div/span/a"));
        firstlink.click();
        String expectedTitle = "How to Become a QA Automation Tester | Coursera";
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
    }

    @Test(dependsOnMethods = "navigateTutorial")
    public void AmazonSearch() {
        driver.navigate().back();

        WebElement SearchBox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        SearchBox.click();
        SearchBox.clear();

        SearchBox.sendKeys("amazon");
        SearchBox.submit();

        WebElement amazonLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3"));
        amazonLink.click();

        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
        WebElement amazonSearchBox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));

        amazonSearchBox.click();
        amazonSearchBox.sendKeys("socks");
        amazonSearchBox.submit();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-component-type='s-search-result']")));
                List<WebElement> searchResults = driver.findElements(By.cssSelector("[data-component-type='s-search-result']"));

   int numberOfSocks= searchResults.size();
        System.out.println("there are:" + numberOfSocks + " Socks in this search");
   Assert.assertEquals(60,(numberOfSocks));
   Assert.assertTrue(numberOfSocks>0,"The search did not return any result for socks");

    }

    @AfterClass
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }
}