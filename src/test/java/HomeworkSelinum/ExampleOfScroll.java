package HomeworkSelinum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ExampleOfScroll {


    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass

    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

@Test
    public void testScroll(){
        driver.get("https://www.amazon.com");

    JavascriptExecutor js =(JavascriptExecutor) driver;
 js.executeScript("window.open()");
   // js.executeScript("Window.scrollBy(0,5000:");
    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
    driver.get("https://www.yahoo.com");
 js.executeScript("window.scrollBy(0,1000)");

    try{Thread.sleep(3000);


    } catch (InterruptedException e) {
        e.printStackTrace();

    }
driver.switchTo().window(tabs.get(0));

  js.executeScript(("window.scrollTo(0,document.body.scrollheight)"));
    try {
        Thread.sleep(3000);
    }catch (InterruptedException e) {
        e.printStackTrace();

    }}}