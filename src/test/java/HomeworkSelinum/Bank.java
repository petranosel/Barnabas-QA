package HomeworkSelinum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Bank {
    private WebDriver driver;
    @BeforeClass
    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

}
@Test  public void Login () {
    driver.get("http://practice.automationtesting.in/");

    // Click on My Account Menu
    WebElement myAccountMenu = driver.findElement(By.linkText("My Account"));
    myAccountMenu.click();

    // Enter registered username in the username textbox
    WebElement usernameTextbox = driver.findElement(By.id("username"));
    usernameTextbox.sendKeys("meedhanie@gmail.com");

    // Enter password in the password textbox
    WebElement passwordTextbox = driver.findElement(By.id("password"));
    passwordTextbox.sendKeys("Barnabasasres");

    // Click on login button
    WebElement loginButton = driver.findElement(By.name("login"));
    loginButton.click();


    WebElement myAccountLink = driver.findElement(By.linkText("My Account"));
    if (myAccountLink.getText().contains("Logout")) {
        System.out.println("Test Passed: User successfully logged in");
    } else {
        System.out.println("Test Failed: User not logged in");
    }
}
@Test
        public void bank2(){

    driver.get("http://practice.automationtesting.in/");

    // Click on My Account Menu
    WebElement myAccountMenu = driver.findElement(By.linkText("My Account"));
    myAccountMenu.click();

    // Enter empty username in the username textbox
    WebElement usernameTextbox = driver.findElement(By.id("username"));
    usernameTextbox.clear(); // Clear any existing text

    WebElement passwordTextbox = driver.findElement(By.id("password"));
    passwordTextbox.click();


    passwordTextbox.sendKeys("Barnabasasres");

    // Click on login button
    WebElement loginButton = driver.findElement(By.name("login"));
    loginButton.click();

    // Verify if the proper error is displayed
    WebElement errorMessageBox = driver.findElement(By.className("woocommerce-error"));
    String errorMessage = errorMessageBox.getText();

    if (errorMessage.contains("Username is required.")) {
        System.out.println("Test Passed: Proper error is displayed for empty username");
    } else {
        System.out.println("Test Failed: Proper error is not displayed for empty username");
    }

    }
  @Test
  public void bank3(){
      driver.get("http://practice.automationtesting.in/");

      // Click on My Account Menu
      WebElement myAccountMenu = driver.findElement(By.linkText("My Account"));
      myAccountMenu.click();


      WebElement passwordField = driver.findElement(By.id("password"));

      // //invalid password
      passwordField.sendKeys("barnabas");

      // Click on the Login button
      WebElement loginButton = driver.findElement(By.name("login"));
      loginButton.click();

      // Verify if the proper error is displayed
      WebElement errorMessageBox = driver.findElement(By.className("woocommerce-error"));
      String errorMessage = errorMessageBox.getText();

      if (errorMessage.contains("ERROR")) { // Replace with the actual error message you expect
          System.out.println("Test Passed: Proper error is displayed");
      } else {
          System.out.println("Test Failed: Proper error is not displayed");
      }
  }



    @AfterClass
    public void cleanUp(){
        if (driver != null){
            driver.quit();

}}}