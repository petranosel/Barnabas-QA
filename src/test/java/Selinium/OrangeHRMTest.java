package Selinium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMTest {
    private WebDriver driver;

    @BeforeClass

    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testOrangeHRMLogin() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //driver.manage().window().minimize();
        String Title = "OrangeHRM";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        OrangeHRMWebElements org = new OrangeHRMWebElements(driver);
        org.SetUsername("admin");
        org.SetPassword("admin123");
        org.clickLoginButton();

        Assert.assertTrue(driver.getTitle().contains(Title),"couldnot get website");
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(25))
                .pollingEvery(Duration.ofSeconds(3));


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")));


       WebElement dashboard = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6"));



        String dashboardText = dashboard.getText();
        Assert.assertEquals(dashboardText, ("Dashboard"));

        //System.out.println("Current URL: " + driver.getCurrentUrl());
        //System.out.println("Dashboard element found: " + dashboard.getText());


    }
@Test(dependsOnMethods = "testOrangeHRMLogin")
public  void testAdmin (){

        OrangeHRMWebElements org1 =new OrangeHRMWebElements(driver);
        org1.clickAdminlink();

        WebElement admin= driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6[2]"));
 String actualAminText = "User management";
 Assert.assertTrue(admin.getText().contains(actualAminText));

    }


@Test
public  void testFormQA(){
        driver.get("https://demoqa.com/automation-practice-form");
WebElement name =driver.findElement (By.xpath(""));
   name .sendKeys("ABCD");

WebElement lastname = driver.findElement(By.xpath(""));
  lastname.sendKeys("EFGH");
    }







       
        }
