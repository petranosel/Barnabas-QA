package HomeworkSelinum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;


public class ExShop {
    private WebDriver driver;
    @BeforeClass
    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
@Test
    public void Ex1Shop(){
    driver.get( "http://practice.automationtesting.in/");
    WebElement shopMenu = driver.findElement(By.linkText("Shop"));
    shopMenu.click();

    // Step 4: Click on the Home menu button
    WebElement homeMenu = driver.findElement(By.linkText("Home"));
    homeMenu.click();

    // Step 5: Test whether the Home page has Three Sliders only
    List<WebElement> sliders = driver.findElements(By.className("nivoSlider"));

    try {
        // Check if there are exactly three sliders
        if (sliders.size() == 3) {
            System.out.println("Test Passed: Home page contains three sliders");
        } else {
            throw new AssertionError("The Home page does not have three sliders");
        }
    } catch (Exception e) {
        System.out.println("Test Failed: " + e.getMessage());
    }


    }

    @Test public void bookstore(){
        driver.get("http://practice.automationtesting.in/");

        // Step 2: Click on the Shop Menu
        WebElement shopMenu = driver.findElement(By.linkText("Shop"));
        shopMenu.click();

        // Step 3: Click on the Home menu button
        WebElement homeMenu = driver.findElement(By.linkText("Home"));
        homeMenu.click();

        // Step 4: Test whether the Home page has Three Arrivals only
        WebElement arrivalsSection = driver.findElement(By.className("products"));
        int numberOfArrivals = arrivalsSection.findElements(By.className("product")).size();
        if (numberOfArrivals == 3) {
            System.out.println("Home page contains three Arrivals.");
        } else {
            System.out.println("Home page does not contain three Arrivals.");
        }

        // Step 5: Click the image in the Arrivals
        WebElement arrivalImage = arrivalsSection.findElement(By.tagName("img"));
        arrivalImage.click();

        // Step 6: Test whether it is navigating to the next page
        // where the user can add the book to his basket
        WebElement addToBasketButton = driver.findElement(By.name("add-to-cart"));
        if (addToBasketButton.isDisplayed()) {
            System.out.println("Navigated to the next page.");
        } else {
            System.out.println("Navigation to the next page failed.");
        }

        // Step 7: Click on the Description tab for the book
        WebElement descriptionTab = driver.findElement(By.xpath("//*[@id=\"product-160\"]/div[3]/ul/li[1]/a"));
        descriptionTab.click();

        // Step 8: Verify there is a description regarding that book
        WebElement bookDescription = driver.findElement(By.xpath("//*[@id=\"tab-description\"]"));
        if (bookDescription.isDisplayed()) {
            System.out.println("Description for the book is displayed.");
        } else {
            System.out.println("Description for the book is not displayed.");
        }

    }

@Test
public void Coupn(){

    driver.get("http://practice.automationtesting.in/");

    // Click on Shop Menu
    WebElement shopMenu = driver.findElement(By.linkText("Shop"));
    shopMenu.click();

    // Click on Home Menu button
    WebElement homeMenu = driver.findElement(By.linkText("Home"));
    homeMenu.click();

    // Test whether the Home page has Three Arrivals only
    java.util.List<WebElement> arrivals = driver.findElements(By.className("arrival-item"));
    if (arrivals.size() == 3) {
        System.out.println("Test Passed: The Home page has only three Arrivals");
    } else {
        System.out.println("Test Failed: The Home page does not have three Arrivals");
    }

    // Click on the first Arrival image
    WebElement firstArrivalImage = arrivals.get(1).findElement(By.tagName("img"));
    firstArrivalImage.click();

    // Test whether it is navigating to the next page
    // Assuming the Add To Basket button is identified by its class
    WebElement addToBasketButton = driver.findElement(By.className("single_add_to_cart_button"));
    if (addToBasketButton.isDisplayed()) {
        System.out.println("Test Passed: The image is clickable and navigates to the next page");
    } else {
        System.out.println("Test Failed: The image is not clickable or does not navigate to the next page");
    }

    // Click on the Add To Basket button
    addToBasketButton.click();

    // User can view that book in the Menu item with price
    WebElement basketMenuItem = driver.findElement(By.linkText("Basket"));
    if (basketMenuItem.getText().contains("1 item -")) {
        System.out.println("Test Passed: The book is added to the basket");
    } else {
        System.out.println("Test Failed: The book is not added to the basket");
    }

    // Click on the Item link which navigates to the proceed to checkout page
    WebElement itemLink = driver.findElement(By.linkText("Item"));
    itemLink.click();

    // User can enter the Coupon code 'krishnasakinala' to get 50rps off on the total
    WebElement couponCodeInput = driver.findElement(By.id("coupon_code"));
    couponCodeInput.sendKeys("krishnasakinala");

    // Apply the coupon
    WebElement applyCouponButton = driver.findElement(By.name("apply_coupon"));
    applyCouponButton.click();

    // Assuming there is an element displaying the discount after applying the coupon
    WebElement discountElement = driver.findElement(By.className("discount"));
    if (discountElement.getText().contains("50rps off")) {
        System.out.println("Test Passed: Coupon applied successfully, and discount displayed");
    } else {
        System.out.println("Test Failed: Coupon not applied or discount not displayed");
    }
}


    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();

        }
    }    }