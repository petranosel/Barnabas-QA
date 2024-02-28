package Selinium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Demoqa {
    private WebDriver driver;
private WebDriverWait wait ;
    @BeforeClass

    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
wait =new WebDriverWait(driver, Duration.ofSeconds(10));

    }



    @Test
    public  void testFormQA(){
       driver.get("https://demoqa.com/automation-practice-form");
        WebElement name =driver.findElement (By.xpath("//*[@id=\"firstName\"]"));
        name .sendKeys("Barnabas");

        WebElement lastname = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
        lastname.sendKeys("Asres");

        WebElement Email = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
        Email.sendKeys("barnabas@gmail.com");

       WebElement gender = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/div[2]/div[1]/label[1]"));
               gender.click();


        WebElement Mobile = driver.findElement(By.xpath("//*[@id=\"userNumber\"]"));
      Mobile.sendKeys("2024565690");



        wait.until(ExpectedConditions.elementToBeClickable(By.className("react-datepicker__input-container")));

// WebElement birth =driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div/div "));
//        birth.click();
//        Select monthSelect = new Select(driver.findElement(By.className("react-datepicker__month-select")));
//        monthSelect.selectByVisibleText("July");
//
//        Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
//        year.selectByVisibleText("1980");
//
//        WebElement day = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[5]"));
//        day.click();

        //wait.until(ExpectedConditions.elementToBeClickable(By.className("")));
//        driver.findElement(By.id("dateOfBirthInput")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")).click();
//        driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[101] ")).click();
//        driver.findElement(By.xpath("//div[text()='1']")).click();
        WebElement Birth = driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]"));
        Birth.sendKeys("15 Feb 2024");



        driver.findElement(By.id("subjectsInput")).sendKeys("QA");
        driver.findElement(By.id("subjectsInput")).sendKeys(Keys.RETURN);


        //driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[7]/div[2]/div[2]/label")).click();
        WebElement hobbies =driver.findElement(By.xpath("//label[text()='Sports']"));
       // hobbies.click();


        WebElement upload = driver.findElement(By.id("uploadPicture"));
        upload.sendKeys("C:\\Users\\meedh\\OneDrive\\Pictures\\pics\\20220626_152135.jpg");

  WebElement CurrentAdress = driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
    CurrentAdress.sendKeys(" 77H st");

//        WebElement stateandcity = driver.findElement(By.id("State"));
//        ((org.openqa.selenium.JavascriptExecutor)driver).executeScript("");
//        driver.findElement(By.id("State")).click();
//    driver.findElement(By.id("")).click();

       // wait.until(ExpectedConditions.elementToBeClickable(By.id("city")));

        // Select State
        driver.findElement(By.id("state")).sendKeys("NCR");
        driver.findElement(By.id("state")).sendKeys(Keys.RETURN);

        // Select City
        driver.findElement(By.id("city")).sendKeys("Delhi");
        driver.findElement(By.id("city")).sendKeys(Keys.RETURN);

        //driver.findElement(By.id("City")).click();
    //driver.findElement(By.id(""));

//        driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[2]/div/svg")).sendKeys("NCR");
//        driver.findElement(By.id("state")).sendKeys(Keys.RETURN);

        // wait.until(ExpectedConditions.elementToBeClickable(By.id("City")));

        //driver.findElement(By.id("city")).sendKeys("Delhi");
        //driver.findElement(By.id("city")).sendKeys(Keys.RETURN);

        
       // WebElement submit = driver.findElement(By.id("submit"));
        // submit.click();

    //WebElement Submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
    // Submit.click();



    }



    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();

}}}