package Selinium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class FileUpload {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass

    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testfileupload(){

   try{
       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

       driver.get("https://demo.guru99.com/test/upload/");
       WebElement fileinput = driver.findElement(By.name("uplpadfile_0"));
String filepath =" \"C:\\Users\\meedh\\OneDrive\\Pictures\\printer\\amazon 2.png\"";

       fileinput.sendKeys(filepath);
WebElement submitButton =driver.findElement(By.id("/html/body/div[4]/div/div/div[2]/form/ul/li/div[2]/h3/center"));
     submitButton.click();
  WebElement sucessText= driver.findElement((By.xpath("/html/body/div[4]/div/div/div[2]/form/ul/li/div[2]/h3/center")));

  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


   String Actualsucess = sucessText.getText();

   String Expectedsucess = "1 file\n" + " has been sucefully uploaded.";
       Assert.assertEquals(Actualsucess,Expectedsucess);

   } catch ( Exception e){ e.printStackTrace();

    } finally { driver.quit();

   }
   }



}
