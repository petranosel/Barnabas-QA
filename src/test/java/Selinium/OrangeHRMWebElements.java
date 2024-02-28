package Selinium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMWebElements {

private static WebDriver driver;

private By usernameLocator =By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
private  By passwordLocator=By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");

private By loginButtonlocator= By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");

private  By adminLinkLocator = By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a");


public  OrangeHRMWebElements(WebDriver driver){

    this.driver=driver;

}
public void SetUsername(String username){
    WebElement userNameInput = driver.findElement(usernameLocator);
userNameInput.sendKeys(username);
}

public void SetPassword(String password)
{WebElement passwordInput= driver.findElement(passwordLocator);
    passwordInput.sendKeys(password);

}
public void clickLoginButton(){
    WebElement loginButton = driver.findElement(loginButtonlocator);
  loginButton.click();
}

public void clickAdminlink(){
    WebElement adminLink = driver.findElement(adminLinkLocator);
  adminLink.click();
}



}


